package lr6.Example63;

public class Main_63 {
    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers provided");
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static int findMin(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers provided");
        }

        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static double findAverage(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers provided");
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
    public static void main(String[] args) {
        // Пример использования методов
        int[] numbers = {10, 5, 8, 15, 20};

        System.out.println("Max Value: " + findMax(numbers));
        System.out.println("Min Value: " + findMin(numbers));
        System.out.println("Average Value: " + findAverage(numbers));
    }
}
