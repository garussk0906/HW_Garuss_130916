package lr9.Tasks.ts5.T;

public class Test1 {
    public static void main(String[] args) {
        // Создаем голову списка (начало списка)
        Node head = null;
        // Создаем хвост списка (конец списка)
        Node tail = null;

        // Добавляем элементы в список, начиная с конца
        for (int i = 9; i >= 0; i--) {
            // Создаем новый узел с данным значением
            Node newNode = new Node(i, null);
            // Если список пустой, устанавливаем новый узел как голову и хвост списка
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                // Иначе добавляем новый узел в конец списка и обновляем ссылку на хвост
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Печатаем содержимое списка
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
