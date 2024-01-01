package Timus.task_2001;

import java.util.Scanner;

public class Main_2001 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        int ber2 = b1 - b2;
        int ber1 = b3 - ber2 - b2;

        System.out.println(ber1 + " " + ber2);
    }
}
