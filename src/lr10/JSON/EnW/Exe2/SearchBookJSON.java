package lr10.JSON.EnW.Exe2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Scanner;

public class SearchBookJSON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите автора для поиска книги:");
        String authorToSearch = scanner.nextLine();

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr10/JSON/Exem/NewFile.jsonМи"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            boolean found = false;

            for (Object bookObj : jsonArray) {
                if (bookObj instanceof JSONObject) {
                    JSONObject book = (JSONObject) bookObj;
                    if (authorToSearch.equalsIgnoreCase((String) book.get("author"))) {
                        found = true;
                        System.out.println("\nНайдена книга автора " + authorToSearch + ":");
                        System.out.println("Название книги: " + book.get("title"));
                        System.out.println("Год издания: " + book.get("year"));
                    }
                }
            }

            if (!found) {
                System.out.println("Книги автора " + authorToSearch + " не найдены.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}