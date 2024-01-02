package lr3;

import java.util.Scanner;

public class Example32_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");

        String dayName = in.nextLine().toLowerCase();
        int dayNum = 0;

        if (dayName.equals("понедельник")) {
            dayNum = 1;
        } else if (dayName.equals("вторник")) {
            dayNum = 2;
        } else if (dayName.equals("среда")) {
            dayNum = 3;
        } else if (dayName.equals("четверг")) {
            dayNum = 4;
        } else if (dayName.equals("пятница")) {
            dayNum = 5;
        } else if (dayName.equals("суббота")) {
            dayNum = 6;
        } else if (dayName.equals("воскресенье")) {
            dayNum = 7;
        }

        if (dayNum != 0) {
            System.out.println("Порядковый номер дня недели: " + dayNum);
        } else {
            System.out.println("Такого дня нет");
        }

        in.close();
    }
}
