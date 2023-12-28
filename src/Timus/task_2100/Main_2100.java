package Timus.task_2100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2100 {
    public Main_2100() {
    }

    public static void main(String[] args) {
        String inputFileName = "src/Timus/task_2100/unput.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int Marchal_Lily = 2;

        try {
            BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)) : new BufferedReader(new FileReader(inputFileName));
            String readLine = "";
            int numberOfFriends = 0;
            int numberOfPairs = 0;

            while((readLine = bufferedReader.readLine()) != null) {
                if (numberOfFriends == 0) {
                    numberOfFriends = Integer.parseInt(readLine);
                } else if (readLine.contains("+")) {
                    ++numberOfPairs;
                }
            }

            int guests = Marchal_Lily + numberOfFriends + numberOfPairs;
            int res;
            if (guests == 13) {
                res = guests * 100 + 100;
            } else {
                res = guests * 100;
            }

            System.out.println(res);
        } catch (IOException var10) {
            var10.printStackTrace();
        }

    }
}
