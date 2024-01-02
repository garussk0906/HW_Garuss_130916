package lr3;

import java.util.Scanner;

public class Example32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String dayName = in.nextLine().toLowerCase();
        int dayNum = 0;

        switch (dayName) {
            case "понедельник":
                dayNum = 1;
                break;
            case "вторник":
                dayNum = 2;
                break;
            case "среда":
                dayNum = 3;
                break;
            case "четверг":
                dayNum = 4;
                break;
            case "пятница":
                dayNum = 5;
                break;
            case "суббота":
                dayNum = 6;
                break;
            case "воскресенье":
                dayNum = 7;
                break;
        }

        if (dayNum != 0) {
            System.out.println("Порядковый номер дня недели: " + dayNum);
        } else {
            System.out.println("Такого дня нет");
        }

        in.close();
    }
}
