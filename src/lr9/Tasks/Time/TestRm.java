package lr9.Tasks.Time;

import java.util.*;

public class TestRm {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> sortedSet = new TreeSet<>();

        // Заполнение коллекций элементами
        for (int i = 0; i < 8000000; i++) {
            arrayList.add(i);
            hashSet.add(i);
            sortedSet.add(i);
        }


        System.out.println("Время выполнения операции удаления из начала arrayList = "
                + getRunningTimeRemoveFirst(arrayList));
        System.out.println("Время выполнения операции удаления из середины arrayList = "
                + getRunningTimeRemoveMiddle(arrayList));
        System.out.println("Время выполнения операции удаления из конца arrayList = "
                + getRunningTimeRemoveLast(arrayList));

        System.out.println("--------------");

        System.out.println("Время выполнения операции удаления из начала hashSet = "
                + getRunningTimeRemoveFirst(hashSet));
        System.out.println("Время выполнения операции удаления из конца hashSet = "
                + getRunningTimeRemoveLast(hashSet));

        System.out.println("--------------");

        System.out.println("Время выполнения операции удаления из начала sortedSet = "
                + getRunningTimeRemoveFirst(sortedSet));
        System.out.println("Время выполнения операции удаления из конца sortedSet = "
                + getRunningTimeRemoveLast(sortedSet));
    }

    // Удаление элемента из начала ArrayList
    private static long getRunningTimeRemoveFirst(List<Integer> list) {
        long start = System.currentTimeMillis();
        list.remove(0);
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Удаление элемента из середины ArrayList
    private static long getRunningTimeRemoveMiddle(List<Integer> list) {
        long start = System.currentTimeMillis();
        list.remove(list.size() / 2);
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Удаление элемента из конца ArrayList
    private static long getRunningTimeRemoveLast(List<Integer> list) {
        long start = System.currentTimeMillis();
        list.remove(list.size() - 1);
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Удаление элемента из начала HashSet и TreeSet
    private static long getRunningTimeRemoveFirst(Set<Integer> set) {
        long start = System.currentTimeMillis();
        set.remove(set.iterator().next());
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Удаление элемента из конца HashSet и TreeSet
    private static long getRunningTimeRemoveLast(Set<Integer> set) {
        long start = System.currentTimeMillis();
        set.remove(set.size() - 1);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
