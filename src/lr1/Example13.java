package lr1;

import java.util.Scanner;

public class Example13 {
    public Example13() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day of the week: ");
        String day_of_the_week = in.nextLine();

        System.out.println("Input num day: ");
        int num_day = in.nextInt();
        in.nextLine();

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.printf("Сегодня %s %s %s", day_of_the_week, num_day, month);
        in.close();
    }
}