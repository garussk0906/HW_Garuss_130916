package lr1;

import java.util.Scanner;

public class Example18 {
    public Example18() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input num1: ");
        int num_1 = in.nextInt();

        System.out.println("Input num2: ");
        int num_2 = in.nextInt();
        int sum = num_1 + num_2;

        System.out.println(sum);
        in.close();
    }
}