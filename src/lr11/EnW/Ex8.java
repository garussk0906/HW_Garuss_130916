package lr11.EnW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Ex8 {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        int threshold = 500; // Заданное значение для фильтрации
        List<Integer> integersAfter = filterGreaterThan(integers, threshold);

        System.out.println("\n" + "Список после фильтрации: " + "\n");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterGreaterThan(List<Integer> list, int threshold) {
        return list.stream()
                .filter(x -> x > threshold)
                .collect(Collectors.toList());
    }
}