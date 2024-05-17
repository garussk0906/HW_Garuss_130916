package lr10.Excel.EnW;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadFileEx {
    public static void main(String[] args) {
        String filePath = "src/lr10/Excel/Exem/File.xlsx";

        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            // Получаем лист по его имени
            XSSFSheet sheet = workbook.getSheet("Товары");

            if (sheet == null) {
                System.out.println("Лист с именем \"Товары\" не найден в файле.");
            } else {
                // Перебираем строки и ячейки листа
                for (Row row : sheet) {
                    for (Cell cell : row) {
                        // Выводим значение ячейки на экран
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println();
                }
            }

            workbook.close();
            inputStream.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла:");
            e.printStackTrace();
        }
    }
}
