package lr9.Tasks.ts8.A;

public class Main {
    public static void main(String[] args) {
        // Создаем новый список
        TestA list = new TestA();

        // Добавляем элементы в список
        list.addFirst(1);
        list.addLast(2);
        list.createHead(3);
        list.createTail(4);
        list.insert(5, 2);

        // Выводим содержимое списка
        System.out.println("Список: " + list.toString());

        // Удаляем элементы из списка
        list.removeFirst();
        list.removeLast();
        list.remove(1);

        // Выводим обновленное содержимое списка
        System.out.println("Обновленный список: " + list.toString());
    }
}
