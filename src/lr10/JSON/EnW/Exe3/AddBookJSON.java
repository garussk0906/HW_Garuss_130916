package lr10.JSON.EnW.Exe3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AddBookJSON {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr10/JSON/Exem/NewFile.json"));
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название книги:");
            String title = scanner.nextLine();
            System.out.println("Введите автора книги:");
            String author = scanner.nextLine();
            System.out.println("Введите год издания книги:");
            int year = scanner.nextInt();

            Map<String, Object> newBook = new LinkedHashMap<>();
            newBook.put("title", title);
            newBook.put("author", author);
            newBook.put("year", year);
            jsonArray.add(newBook);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String prettyJson = gson.toJson(jsonObject);

            FileWriter file = new FileWriter("src/lr10/JSON/Exem/NewFile.json");
            file.write(prettyJson);
            file.flush();
            file.close();

            System.out.println("Новая книга успешно добавлена в файл JSON.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
