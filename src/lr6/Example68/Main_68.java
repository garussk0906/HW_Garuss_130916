package lr6.Example68;

import java.util.Arrays;
public class Main_68 {
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
    public static void main(String[] args) {
        int[] intArray = {5, 10, 15, 20, 25};
        double average = calculateAverage(intArray);

        System.out.println("Массив: " + Arrays.toString(intArray));
        System.out.println("Среднее значение массива: " + average);
    }
}
