package Timus.task_1910;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main_1910 {
    public static void main(String[] args) throws IOException {

        String inputFileName = "src/Timus/task_1910/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;


        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));
        PrintWriter out = new PrintWriter(System.out);

        int size = Integer.parseInt(bufferedReader.readLine());

        String[] strings = bufferedReader.readLine().split(" ");

        int[] intAfter = new int[size - 2];

        for (int i = 0; i < intAfter.length; i++) {
            intAfter[i] = Integer.parseInt(strings[i]) +
                    Integer.parseInt(strings[i + 1]) +
                    Integer.parseInt(strings[i + 2]);
        }

        int[] ints = Arrays.copyOf(intAfter, intAfter.length);
        Arrays.sort(intAfter);

        int firstValue = intAfter[intAfter.length - 1];

        for (int i = 0; i < intAfter.length; i++) {
            if (ints[i] == firstValue) {
                out.println(firstValue + " " + (i + 2));
                break;
            }
        }
        out.flush();
    }
}