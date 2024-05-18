package Timus2Sem.task_1068;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        new Main().solveMain();
    }

    private StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private PrintWriter output = new PrintWriter(System.out);

    private int getValue() throws IOException {
        this.input.nextToken();
        return (int) this.input.nval;
    }

    private void solveMain() throws IOException {
        int n = this.getValue();
        int result = 0;

        if (n > 0) {
            result = (n * (n + 1)) / 2;
        } else {
            result = (1 - n) * n / 2 + 1;
        }

        this.output.println(result);
        this.output.flush();
    }
}
