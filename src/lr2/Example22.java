package lr2;

import java.util.Scanner;

public class Example22 {
    public Example22() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input num: ");
        int num = in.nextInt();
        int res = num % 5;
        int res2 = num % 7;

        if (res == 2 && res2 == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println(res);
        System.out.println(res2);
        in.close();
    }
}