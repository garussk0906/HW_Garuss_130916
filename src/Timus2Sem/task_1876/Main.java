package Timus2Sem.task_1876;

import java.util.Scanner;

public class Main {

    private Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().solve();
    }

    private void solve() {
        int left = in.nextInt();
        int right = in.nextInt();
        int case1 = 40 + right * 2;
        int case2 = 78 + 40 + (left-40)*2 + 1;

        System.out.println(Math.max(case1, case2));
    }
}