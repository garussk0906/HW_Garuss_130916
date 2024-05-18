package lr13.Task2;

import java.util.Scanner;

public class Exs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите количество строк матрицы: ");
            int rows = Integer.parseInt(scanner.nextLine());

            System.out.print("Введите количество столбцов матрицы: ");
            int columns = Integer.parseInt(scanner.nextLine());

            int[][] matrix = new int[rows][columns];

            // Заполнение матрицы
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Введите элемент матрицы [" + i + "][" + j + "]: ");
                    matrix[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }

            System.out.print("Введите номер столбца для вывода: ");
            int columnNumber = Integer.parseInt(scanner.nextLine());

            // Проверка введенного номера столбца
            if (columnNumber < 1 || columnNumber > columns) {
                throw new IllegalArgumentException("Нет столбца с таким номером.");
            }

            // Вывод столбца
            System.out.println("Столбец с номером " + columnNumber + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][columnNumber - 1]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введена строка вместо числа.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
