package lr4;

import java.util.Arrays;
import java.util.Random;
public class Example46 {
    public static void main(String[] args) {
        int rows = 5; // Количество строк массива
        int columns = 5; // Количество столбцов массива

        int[][] originalArray = new int[rows][columns];
        Random random = new Random();

        // Инициализация и заполнение массива случайными числами
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                originalArray[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Исходный массив:");
        printArray(originalArray);

        // Генерация случайных индексов строки и столбца для удаления
        int rowToRemove = random.nextInt(rows);
        int columnToRemove = random.nextInt(columns);

        System.out.println("\nУдаляем строку с индексом " + rowToRemove + " и столбец с индексом " + columnToRemove);

        // Создание нового массива с удаленной строкой и столбцом
        int[][] newArray = new int[rows - 1][columns - 1];
        int newRow = 0;
        int newColumn;

        for (int i = 0; i < rows; i++) {
            if (i != rowToRemove) {
                newColumn = 0;
                for (int j = 0; j < columns; j++) {
                    if (j != columnToRemove) {
                        newArray[newRow][newColumn] = originalArray[i][j];
                        newColumn++;
                    }
                }
                newRow++;
            }
        }

        System.out.println("\nНовый массив после удаления строки и столбца:");
        printArray(newArray);
    }

    // Метод для вывода массива в консоль
    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
