package lr3;

import java.util.Scanner;

public class Example33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество чисел в последовательности Фибоначчи: ");
        int count = in.nextInt();

        int first = 1;
        int second = 1;

        System.out.println("Последовательность чисел Фибоначчи:");

        if (count >= 1) {
            System.out.print(first + " ");
        }
        if (count >= 2) {
            System.out.print(second + " ");
        }

        for (int i = 3; i <= count; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

        in.close();
    }
}
