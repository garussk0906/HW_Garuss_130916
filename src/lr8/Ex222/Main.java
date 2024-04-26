package lr8.Ex222;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Открываем исходный файл для чтения
            InputStream inFile = new FileInputStream("C:\\Users\\garus\\Рабочий стол\\Новая папка\\Klipka.txt");
            Reader rFile = new InputStreamReader(inFile, "UTF-8");
            BufferedReader reader = new BufferedReader(rFile);

            // Открываем файл для записи
            FileWriter wr = new FileWriter("C:\\Users\\garus\\Рабочий стол\\Новая папка\\Kli2.txt");
            BufferedWriter br = new BufferedWriter(wr);

            // Пропускаем первую строку
            String firstLine = reader.readLine();

            // Записываем вторую строку в результирующий файл
            String secondLine = reader.readLine();
            br.write(secondLine);
            br.newLine();

            // Читаем и переписываем числа
            String numbersLine = reader.readLine();
            if (numbersLine != null) {
                String[] numbers = numbersLine.split(" ");
                for (String numStr : numbers) {
                    double num = Double.parseDouble(numStr);
                    if (num > 0) {
                        br.write(numStr);
                        br.newLine();
                    }
                }
            }

            // Закрываем потоки
            reader.close();
            br.close();

            System.out.println("Данные успешно переписаны.");
        } catch (IOException e) {
            System.out.println("Ошибка: ");
        }
        }
    }

