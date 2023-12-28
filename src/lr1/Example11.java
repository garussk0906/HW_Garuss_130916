package lr1;

import java.util.Scanner;

public class Example11 {
    public Example11() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input surname: ");
        String surname = in.nextLine();

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input middle name: ");
        String middle_name = in.nextLine();

        System.out.printf("Hello, %s %s %s ", surname, name, middle_name);
        in.close();
    }
}