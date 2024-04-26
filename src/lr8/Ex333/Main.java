package lr8.Ex333;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Путь к исходному файлу
        String sourceFilePath = "src/lr8/Ex333/source.txt";
        // Путь к файлу, в который будут записаны слова начинающиеся с согласных
        String resultFilePath = "src/lr8/Ex333/result.txt";

        try {
            // Открываем исходный файл для чтения
            FileReader fr = new FileReader(sourceFilePath);
            BufferedReader rd = new BufferedReader(fr);

            // Открываем файл для записи результата
            FileWriter fw = new FileWriter(resultFilePath);
            BufferedWriter w = new BufferedWriter(fw);

            // Переменная для хранения номера текущей строки
            int lineNumber = 0;

            // Читаем и обрабатываем каждую строку
            String line;
            while ((line = rd.readLine()) != null) {
                lineNumber++;

                // Разбиваем строку на слова
                String[] words = line.split("\\s+");

                // Переменная для хранения количества слов, начинающихся с согласных
                int consonantWordsCount = 0;

                // Проверяем каждое слово в строке
                for (String word : words) {
                    // Проверяем, начинается ли слово с согласной буквы
                    if (startsWithConsonant(word)) {
                        consonantWordsCount++;
                        // Записываем слово и номер строки в результирующий файл
                        w.write("Строка " + lineNumber + ": " + word);
                        w.newLine();
                    }
                }

                // Записываем количество слов, начинающихся с согласных, в текущей строке
                w.write("Количество слов на согласную в строке: " + consonantWordsCount);
                w.newLine();
                w.newLine(); // Пустая строка для разделения строк в результате
            }

            // Закрываем потоки
            rd.close();
            w.close();

            System.out.println("Данные успешно скопированы.");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // Метод для проверки, начинается ли слово с согласной буквы
    private static boolean startsWithConsonant(String word) {
        // Проверяем, если первая буква слова не гласная
        return !word.matches("[АЕЁИОУЫЭЮЯаеёиоуыэюя].*");
    }
}
