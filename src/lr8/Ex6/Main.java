package lr8.Ex6;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("C:\\Users\\garus\\Рабочий стол\\Новая папка\\Klipka.txt");
            out = new FileWriter("C:\\Users\\garus\\Рабочий стол\\Новая папка\\Kli2.txt", true);

            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.append((char) oneByte);
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }

        finally {
            in.close();
            out.close();
        }
    }
}
