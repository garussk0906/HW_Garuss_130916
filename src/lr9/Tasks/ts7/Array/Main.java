package lr9.Tasks.ts7.Array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int N = 10; // Количество людей в кругу
        ArrayList<Integer> circle = new ArrayList<>();

        // Заполнение круга
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int index = 0;
        while (circle.size() > 1) {
            index = (index + 1) % circle.size();
            circle.remove(index);
        }

        System.out.println("Остался человек с номером " + circle.get(0));
    }
}
