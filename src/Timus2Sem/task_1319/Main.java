package Timus2Sem.task_1319;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private Scanner in = new Scanner(System.in);
    private PrintWriter output = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    private void run() throws IOException {
        int data = this.getValue();

        this.solve(data);
    }

    private void solve(int data) {
        int[][] matrix = new int[data][data];
        int count = 1;
        int max = data*data;
        for (int i = 0; i<data; i++){
            for (int j = i; j>=0; j--){
                matrix[i-j][data-j-1] = count;
                count++;
            }
        }

        for (int i = data; i>1; i--){
            for (int j = i; j<=data; j++){
                matrix[i+data-j-1][data-j] = max;
                max--;
            }
        }

        for (int i = 0; i<data; i++){
            for (int j = 0; j<data; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private int getValue() throws IOException {
        return Integer.parseInt(this.in.nextLine());
    }
}
