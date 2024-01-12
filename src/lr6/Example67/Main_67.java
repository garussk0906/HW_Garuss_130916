package lr6.Example67;

import java.util.Arrays;
public class Main_67 {
    public static int[] convertCharArrayToIntArray(char[] charArray) {
        if (charArray == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = (int) charArray[i];
        }
        return intArray;
    }
    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'C'};
        int[] intArray = convertCharArrayToIntArray(charArray);

        System.out.println("Символьный массив: " + Arrays.toString(charArray));
        System.out.println("Числовой массив: " + Arrays.toString(intArray));
    }
}
