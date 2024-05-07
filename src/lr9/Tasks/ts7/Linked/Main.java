package lr9.Tasks.ts7.Linked;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int N = 10; // Количество людей в кругу
        LinkedList<Integer> circle = new LinkedList<>();

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


// быстрее будет работать при больших значениях N