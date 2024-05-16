package lr10.HTML.EnW.E2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Mist {
    public static void main(String[] args) {
        int maxAttempts = 3; // Максимальное количество попыток подключения
        int attempts = 0; // Текущее количество попыток

        while (attempts < maxAttempts) {
            try {
                // Получаем HTML-код страницы
                Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

                // Извлекаем список новостей
                Elements newParent = doc.select("body > table > tbody > td > div > table > " +
                        "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                        "tr > td:nth-child(1)");

                // Открываем файл для записи
                FileWriter writer = new FileWriter("src/lr10/HTML/EnW/E2/Mist.txt");

                // Записываем последние 10 новостей в файл
                for (int i = 3; i < 20; i++) {
                    if (!(i % 2 == 0)) {
                        List<Node> nodes = newParent.first().childNodes();
                        String tema = "Тема : " +
                                ((Element) nodes.get(i))
                                        .getElementsByClass("blocktitle")
                                        .get(0).childNodes().get(0).toString();
                        String date = "Дата : " +
                                ((Element) nodes.get(i))
                                        .getElementsByClass("blockdate")
                                        .get(0).childNodes().get(0).toString() + "\n";

                        // Записываем в файл
                        writer.write(tema + "\n");
                        writer.write(date + "\n");
                    }
                }

                // Закрываем файл после записи
                writer.close();

                System.out.println("Данные успешно записаны в файл 'src/lr10/HTML/EnW/E2/Mist.txt'");
                break; // Выходим из цикла, если данные успешно записаны
            } catch (IOException e) {
                attempts++; // Увеличиваем счетчик попыток
                System.out.println("Ошибка при получении HTML-кода страницы: " + e.getMessage());
                System.out.println("Попытка переподключения...");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Превышено максимальное количество попыток. Не удалось получить данные.");
        }
    }
}
