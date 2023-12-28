package lr1;

import java.util.Scanner;

public class Example16 {
    public Example16() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int now_year = 2023;

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input year of birth: ");
        int year_of_birth = in.nextInt();
        int age = now_year - year_of_birth;

        System.out.printf("%s your age %s", name, age);
        in.close();
    }
}