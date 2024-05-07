package lr9.Tasks.ts8.B;

public class Recursion {
    private Node head;

    public Recursion() {
        this.head = null;
    }

    // Метод для ввода элемента с головы списка с использованием рекурсии
    public void createHeadRec(int data) {
        head = createHeadRecHelper(head, data);
    }

    // Вспомогательный метод для ввода элемента с головы списка с использованием рекурсии
    private Node createHeadRecHelper(Node current, int data) {
        if (current == null) {
            return new Node(data, null);
        }
        current.next = createHeadRecHelper(current.next, data);
        return current;
    }

    // Метод для ввода элемента с хвоста списка с использованием рекурсии
    public void createTailRec(int data) {
        if (head == null) {
            head = new Node(data, null);
        } else {
            createTailRecHelper(head, data);
        }
    }

    // Вспомогательный метод для ввода элемента с хвоста списка с использованием рекурсии
    private void createTailRecHelper(Node current, int data) {
        if (current.next == null) {
            current.next = new Node(data, null);
        } else {
            createTailRecHelper(current.next, data);
        }
    }

    // Метод для вывода списка в виде строки с использованием рекурсии
    public String toStringRec() {
        return toStringRecHelper(head);
    }

    // Вспомогательный метод для вывода списка в виде строки с использованием рекурсии
    private String toStringRecHelper(Node current) {
        if (current == null) {
            return "";
        }
        return current.data + " " + toStringRecHelper(current.next);
    }

    // Внутренний класс для представления узла списка
    private static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
