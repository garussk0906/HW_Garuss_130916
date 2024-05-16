package lr10.JSON.EnW.Exe4;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DeleteBookJSON {
    public static void main(String[] args) {
        deleteBookByTitle();
    }

    public static void deleteBookByTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название книги для удаления: ");
        String title = scanner.nextLine();
        scanner.close();

        try {
            // Чтение JSON-файла
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr10/JSON/Exem/NewFile.json"));
            JSONObject jsonObject = (JSONObject) obj;

            // Получение массива книг
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            // Итерация по массиву книг для удаления книги с заданным названием
            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject bookObject = (JSONObject) iterator.next();
                Book book = new Gson().fromJson(bookObject.toJSONString(), Book.class);
                if (title.equals(book.getTitle())) {
                    iterator.remove();
                    break; // Для оптимизации, можно прервать цикл после удаления книги
                }
            }

            // Преобразование JSONArray в ArrayList для сохранения порядка книг
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Type listType = new TypeToken<ArrayList<Book>>() {}.getType();
            ArrayList<Book> books = gson.fromJson(jsonArray.toJSONString(), listType);

            // Запись изменений обратно в JSON-файл, сохраняя порядок и форматирование
            FileWriter file = new FileWriter("src/lr10/JSON/Exem/NewFile.json");
            gson.toJson(books, file);
            file.flush();
            file.close();
            System.out.println("Книга с названием \"" + title + "\" удалена из JSON-файла.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Book {
        private int year;
        private String author;
        private String title;

        // Геттеры и сеттеры для полей year, author и title

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
