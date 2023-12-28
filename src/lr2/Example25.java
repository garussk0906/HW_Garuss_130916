package lr2;

import java.util.Scanner;

public class Example25 {
    public Example25() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input num: ");
        int num = in.nextInt();

        num /= 1000;
        num %= 10;

        if (num == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println(num);
        in.close();
    }
}