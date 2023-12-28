package lr1;

import java.util.Scanner;

public class Example17 {
    public Example17() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int now_year = 2023;

        System.out.println("Input your age: ");
        int your_age = in.nextInt();
        int year_of_birth = now_year - your_age;

        System.out.println("Your year of birth " + year_of_birth);
        in.close();
    }
}