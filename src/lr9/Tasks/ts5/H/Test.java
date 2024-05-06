package lr9.Tasks.ts5.H;

public class Test {
    public static void main(String[] args) {
        // Создаем голову списка (начало списка)
        Node head = null;

        // Добавляем элементы в список, начиная с конца
        for (int i = 9; i >= 0; i--) {
            // Создаем новый узел с данным значением и ссылкой на текущую голову списка
            head = new Node(i, head);
        }

        // Печатаем содержимое списка
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
