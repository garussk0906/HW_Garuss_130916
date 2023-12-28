package lr1;

import java.util.Scanner;

public class Example15 {
    public Example15() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int now_year = 2023;

        System.out.println("Input year of birth: ");
        int year_of_birth = in.nextInt();
        int age = now_year - year_of_birth;

        System.out.println("Your age " + age);
        in.close();
    }
}