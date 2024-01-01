package Timus.task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main_2012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int numOfTasks = in.nextInt();
        int diff = 12 - numOfTasks;
        int time = diff * 45;

        String res = time <= 240 ? "YES" : "NO";

//        if(time <= 240) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
        out.println(res);
        out.flush();
    }
}
