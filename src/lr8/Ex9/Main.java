package lr8.Ex9;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader
                    (new InputStreamReader
                            (new FileInputStream
                                    ("C:\\Users\\garus\\Рабочий стол\\Новая папка\\Klipka.txt"), "cp1251"));
            bw = new BufferedWriter
                    (new OutputStreamWriter
                            (new FileOutputStream
                                    ("C:\\Users\\garus\\Рабочий стол\\Новая папка\\Kli2.txt"), "cp1251"));

            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null) {
                lineCount ++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
        finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
