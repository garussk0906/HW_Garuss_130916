package lr9.Ex5;

public class RecursionSamRab {
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + fact(5));
    }

    public static int fact(int n) {
        System.out.println("Entering fact(" + n + ")");
        if (n == 0) {
            System.out.println("Returning 0");
            return 0;
        } else if (n == 1) {
            System.out.println("Returning 1");
            return 1;
        } else {
            int result = fact(n - 2) + fact(n - 1);
            System.out.println("Returning fact(" + (n - 2) + ") + fact(" + (n - 1) + ") = " + result);
            return result;
        }
    }
}
