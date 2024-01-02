package lr3;

import java.util.Scanner;
public class Example35_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество чисел для суммирования: ");
        int count = in.nextInt();

        int sum = 0;
        int numbersFound = 0;
        int i = 1;

        System.out.println("Числа, удовлетворяющие критериям:");

        while (numbersFound < count) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                sum += i;
                numbersFound++;
            }
            i++;
        }

        System.out.println("\nСумма чисел, удовлетворяющих критериям: " + sum);

        in.close();
    }
}
