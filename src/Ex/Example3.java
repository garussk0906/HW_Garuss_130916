package Ex;


public class Example3 {
    public Example3() {
    }

    public static void main(String[] args) {
        int s = 10;
        int d = 20;
        if (s < d) {
            System.out.println("S < D");
        }

        s *= 2;
        if (s == d) {
            System.out.println("S = D");
        }

        s *= d;
        if (s > d) {
        }

        System.out.println("S > D");
    }
}