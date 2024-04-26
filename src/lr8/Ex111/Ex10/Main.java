package lr8.Ex111.Ex10;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;

        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(
                                    "C:\\Users\\garus\\Рабочий стол\\Новая папка\\Klipka.txt"), "cp1251"));
            out = new PrintWriter(
                    "C:\\Users\\garus\\Рабочий стол\\Новая папка\\Kli2.txt","cp1251");

            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null) {
                lineCount ++;
                out.println(lineCount + ": " + s );
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (out != null) {
                out.flush();
                out.close();
            }
    }
    }
}
