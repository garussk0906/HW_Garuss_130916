package lr2;

import java.util.Scanner;

public class Example24 {
    public Example24() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input num: ");
        int num = in.nextInt();

        if (num >= 5 && num <= 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        in.close();
    }
}

