package lr4;

import java.util.Arrays;
import java.util.Random;

public class Example45 {
    public static void main(String[] args) {
        int rows = 3; // Количество строк исходного массива
        int columns = 5; // Количество столбцов исходного массива

        // Создание и заполнение исходного двумерного массива случайными числами
        int[][] originalArray = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                originalArray[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Исходный массив:");
        printArray(originalArray);

        // Создание нового массива с обменом строк и столбцов
        int[][] swappedArray = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                swappedArray[i][j] = originalArray[j][i];
            }
        }

        System.out.println("\nМассив после обмена строк и столбцов:");
        printArray(swappedArray);
    }

    // Метод для вывода массива в консоль
    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
