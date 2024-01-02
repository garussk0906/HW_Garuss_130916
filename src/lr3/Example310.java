package lr3;

import java.util.Arrays;
import java.util.Random;
public class Example310 {
    public static void main(String[] args) {
        int size = 10; // Размер массива

        int[] numbersArray = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbersArray[i] = random.nextInt(100);
        }
        System.out.println("Исходный массив случайных чисел:");
        System.out.println(Arrays.toString(numbersArray));

        Arrays.sort(numbersArray);
        reverseArray(numbersArray);

        System.out.println("Массив после сортировки в порядке убывания:");
        System.out.println(Arrays.toString(numbersArray));
    }
    private static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
