package lr3;

import java.util.Scanner;

public class Example36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Введите размер массива: ");
                size = in.nextInt();

                if (size <= 0) {
                    System.out.println("Введите положительное число больше нуля.");
                } else {
                    validInput = true;
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
                in.next();
            }
        }

        int[] numbersArray = new int[size];
        int count = 0;

        for (int i = 2; count < size; i += 5) {
            if (i % 5 == 2) {
                numbersArray[count] = i;
                count++;
            }
        }

        System.out.println("Массив чисел, удовлетворяющих условию (деление на 5 с остатком 2):");
        for (int num : numbersArray) {
            System.out.print(num + " ");
        }
        in.close();
    }
}