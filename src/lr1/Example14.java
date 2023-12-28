package lr1;

import java.util.Scanner;

public class Example14 {
    public Example14() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input number of days in a month: ");
        int num_of_days = in.nextInt();
        in.nextLine();

        System.out.printf("В месяце %s %s дней", month, num_of_days);
        in.close();
    }
}