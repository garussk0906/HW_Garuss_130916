package lr3;

import java.util.Scanner;
public class Example34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе целое число: ");
        int num2 = in.nextInt();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        System.out.println("Целые числа между " + start + " и " + end + ":");

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }

        in.close();
    }
}

