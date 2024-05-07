package lr9.Tasks.ts8.B;

public class TestB {
    public static void main(String[] args) {
        // Создаем новый экземпляр класса RecursiveLinkedList
        Recursion list = new Recursion();

        // Добавляем элементы с головы списка
        list.createHeadRec(1);
        list.createHeadRec(2);
        list.createHeadRec(3);

        // Выводим список
        System.out.println("Список после ввода с головы: " + list.toStringRec());

        // Добавляем элементы с хвоста списка
        list.createTailRec(4);
        list.createTailRec(5);
        list.createTailRec(6);

        // Выводим список
        System.out.println("Список после ввода с хвоста: " + list.toStringRec());
    }
}
