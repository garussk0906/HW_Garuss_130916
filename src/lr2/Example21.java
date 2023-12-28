package lr2;

import java.util.Scanner;

public class Example21 {
    public Example21() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input num: ");
        int num = in.nextInt();
        int res = num % 3;

        if (res == 0) {
            System.out.println("Число делится на 3");
        } else {
            System.out.println("Число не делится на 3");
        }

        in.close();
    }
}