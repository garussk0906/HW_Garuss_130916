package lr6.Example69;

import java.util.Arrays;
public class Main_69 {
    public static void swapPairs(char[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Input array must have at least two elements");
        }

        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }
    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("Массив: " + Arrays.toString(charArray));

        swapPairs(charArray);

        System.out.println("Обратный массив: " + Arrays.toString(charArray));
    }
}
