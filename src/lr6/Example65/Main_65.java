package lr6.Example65;

public class Main_65 {
    public static int calculateSumOfSquares(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Отрицательный ввод не допускается");
        }
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }
    public static void main(String[] args) {
        int number = 5;
        int sumOfSquares = calculateSumOfSquares(number);

        System.out.println("Сумма квадратов для " + number + " это: " + sumOfSquares);
    }
}