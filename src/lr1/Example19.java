package lr1;

import java.util.Scanner;

public class Example19 {
    public Example19() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input num1: ");
        int num_1 = in.nextInt();

        System.out.println(num_1 - 1);
        System.out.println(num_1);
        System.out.println(num_1 + 1);
        System.out.println((num_1 - 1 + num_1 + num_1 + 1) * (num_1 - 1 + num_1 + num_1 + 1));
        in.close();
    }
}