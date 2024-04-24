package lr8.Ex8;

import java.io.*;
import java.net.URL;

public class Main {
    public static void readAllByByte(Reader in) throws IOException {
        while(true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("C:\\Users\\garus\\Рабочий стол\\Новая папка\\Klipka.txt");

            Reader rFile = new InputStreamReader(inFile, "cp1251");
            readAllByByte(rFile);
            System.out.print("\n\n\n");
            rFile.close();

            InputStream inUrl = new URL("https://ya.ru/").openStream();
            Reader rUrl = new InputStreamReader(inUrl, "cp1251");
            readAllByByte(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[] {7,9,3,7,4});
            Reader rArray = new InputStreamReader(inArray, "cp1251");
            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e){
            System.out.println("Ошибка: " + e);
        }
    }
}
