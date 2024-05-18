package Timus2Sem.task_1545;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().solve();
    }

    private void solve() {
        int n = in.nextInt();
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i<n; i++){
            strings.add(in.next());
        }
        char input = in.next().charAt(0);
        for (String s: strings){
            if (s.charAt(0)==input){
                System.out.println(s);
            }
        }
    }
}