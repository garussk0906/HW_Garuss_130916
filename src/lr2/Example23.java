package lr2;

import java.util.Scanner;

public class Example23 {
    public Example23() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input num: ");
        int num = in.nextInt();
        int res = num % 4;

        if (res == 0 && num >= 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println(res);
        in.close();
    }
}