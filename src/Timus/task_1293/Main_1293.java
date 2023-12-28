package Timus.task_1293;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main_1293 {
    public Main_1293() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int res = N * A * B * 2;
        out.println(res);
        out.flush();
    }
}
