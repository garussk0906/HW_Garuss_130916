package lr11.EnW;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex7 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("кот");
        strings.add("собака");
        strings.add("слон");
        strings.add("мышь");
        strings.add("тигр");

        System.out.println("\n" + "Список до: " + "\n");
        for (String s : strings) {
            System.out.println(s);
        }

        int minLength = 4; // Заданная минимальная длина
        List<String> stringsAfter = filterStringsByLength(strings, minLength);

        System.out.println("\n" + "Список после фильтрации: " + "\n");
        for (String s : stringsAfter) {
            System.out.println(s);
        }
    }

    public static List<String> filterStringsByLength(List<String> list, int minLength) {
        return list.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }
}