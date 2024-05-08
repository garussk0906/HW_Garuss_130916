package lr9.Tasks.Time;

import java.util.*;

public class TestIndex {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        TreeSet<Integer> sortedSet = new TreeSet<>();
        int ind = 100000;
        System.out.println(ind);

        for (int i = 0; i < 40000000; i++) {
            arrayList.add(i);
            sortedSet.add(i);
        }

        System.out.println("Время выполнения операции получения элемента по индексу arrayList = " +
                getRunningTimeGetByIndex(arrayList, ind));

        System.out.println("Время выполнения операции получения элемента по индексу sortedSet = " +
                getRunningTimeGetByIndex(sortedSet, ind));
    }

    // Получение элемента по индексу из ArrayList
    private static long getRunningTimeGetByIndex(List<Integer> list, int index) {
        long start = System.currentTimeMillis();
        list.get(index);
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Получение элемента по индексу из TreeSet
    private static long getRunningTimeGetByIndex(TreeSet<Integer> set, int index) {
        long start = System.currentTimeMillis();
        // Преобразование TreeSet в массив и получение элемента по индексу
        Integer[] array = set.toArray(new Integer[0]);
        // Используйте полученный элемент, если это необходимо
        Integer element = array[index];
        long end = System.currentTimeMillis();
        return end - start;
    }
}
