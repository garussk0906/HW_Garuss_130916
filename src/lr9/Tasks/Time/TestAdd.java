package lr9.Tasks.Time;

import java.util.*;

public class TestAdd {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> sortedSet = new TreeSet<>();

        System.out.println("Время выполнения операции добавления arrayList = " +
                getRunningTime(arrayList));
        System.out.println("Время выполнения операции добавления hashSet = " +
                getRunningTime(hashSet));
        System.out.println("Время выполнения операции добавления sortedSet = " +
                getRunningTime(sortedSet));

        System.out.println("--------------");

        System.out.println("Время выполнения операции добавления в начало arrayList = "
                + getRunningTimeAddFirst(arrayList, 0));
        System.out.println("Время выполнения операции добавления в середину arrayList = "
                + getRunningTimeAddFirst(arrayList, 8000000 / 2));
        System.out.println("Время выполнения операции добавления в конец arrayList = "
                + getRunningTimeAddLast(arrayList));

        System.out.println("--------------");

        System.out.println("Время выполнения операции добавления в начало hashSet = "
                + getRunningTimeAddFirst(hashSet, 111));
        System.out.println("Время выполнения операции добавления в конец hashSet = "
                + getRunningTimeAddLast(hashSet, 666));

        System.out.println("--------------");

        System.out.println("Время выполнения операции добавления в начало sortedSet = "
                + getRunningTimeAddFirst(sortedSet, 111));
        System.out.println("Время выполнения операции добавления в конец sortedSet = "
                + getRunningTimeAddLast(sortedSet, 666));


    }

    // Добавление элемента в начало ArrayList
    private static long getRunningTimeAddFirst(List<Integer> list, int ind) {
        long start = System.currentTimeMillis();
        list.add(ind, 666);
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Добавление элемента в конец ArrayList
    private static long getRunningTimeAddLast(List<Integer> list) {
        long start = System.currentTimeMillis();
        list.add(666);
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Добавление элемента в начало HashSet и sortedSet
    private static long getRunningTimeAddFirst(Set<Integer> set, int elem) {
        long start = System.currentTimeMillis();
        set.add(elem);
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Добавление элемента в конец HashSet и sortedSet
    private static long getRunningTimeAddLast(Set<Integer> set, int elem) {
        return getRunningTimeAddFirst(set, elem);
    }



    // Наполнение структур данных элементами
    private static long getRunningTime(Collection<Integer> collection) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 8000000; i++) {
            collection.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}