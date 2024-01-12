package lr6.Example64;

public class Main_64 {
    public static int calculateDoubleFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative input is not allowed");
        }

        int result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }

        return result;
    }
    public static void main(String[] args) {
        int number = 6;
        int doubleFactorial = calculateDoubleFactorial(number);

        System.out.println(number + "!! = " + doubleFactorial);
    }
}
