package lr11.EnW;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex9 {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("кот");
        strings.add("собака123");
        strings.add("слон!");
        strings.add("мышь");
        strings.add("тигр#");

        System.out.println("\n" + "Список до: " + "\n");
        for (String s : strings) {
            System.out.println(s);
        }

        List<String> stringsAfter = filterAlphabeticStrings(strings);

        System.out.println("\n" + "Список после фильтрации: " + "\n");
        for (String s : stringsAfter) {
            System.out.println(s);
        }
    }

    public static List<String> filterAlphabeticStrings(List<String> list) {
        return list.stream()
                .filter(s -> s.chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());
    }
}