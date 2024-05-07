package lr9.Tasks.ts6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Создаем HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Заполняем HashMap 10 объектами <Integer, String>
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "cherry");
        map.put(4, "date");
        map.put(5, "elderberry");
        map.put(6, "fig");
        map.put(7, "grape");
        map.put(8, "honeydew");
        map.put(9, "kiwi");
        map.put(0, "lemon");

        // Находим строки, у которых ключ больше 5, и если ключ равен 0, выводим эти строки через запятую
        StringBuilder five = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            } else if (entry.getKey() == 0) {
                five.append(entry.getValue()).append(",");
            }
        }
        // Выводим строки с ключом 0 через запятую
        if (five.length() > 0) {
            System.out.println("Strings with key 0: " + five.substring(0, five.length() - 1));
        } else {
            System.out.println("No strings with key 0 found.");
        }

        // Перемножаем все ключи, где длина строки больше 5
        int multiplication = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                multiplication *= entry.getKey();
            }
        }
        System.out.println("Multiplication of keys with string length > 5: " + multiplication);
    }
}
