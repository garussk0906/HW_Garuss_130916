package lr9.Tasks.ts8.A;

public class TestA {
    private Node head; // Указатель на голову списка

    // Конструктор класса, инициализирующий голову списка как null
    public TestA() {
        this.head = null;
    }

    // Метод для создания нового узла и добавления его в начало списка
    public void createHead(int data) {
        Node newNode = new Node(data, head); // Создаем новый узел с заданными данными и указателем на текущую голову
        head = newNode; // Обновляем голову списка
    }

    // Метод для создания нового узла и добавления его в конец списка
    public void createTail(int data) {
        Node newNode = new Node(data, null); // Создаем новый узел с заданными данными и указателем на null (конец списка)
        if (head == null) { // Если список пуст
            head = newNode; // Новый узел становится головой списка
        } else { // Если список не пуст
            Node current = head; // Указатель на текущий узел устанавливаем в начало списка
            while (current.next != null) { // Идем до конца списка
                current = current.next; // Переходим к следующему узлу
            }
            current.next = newNode; // Устанавливаем указатель последнего узла на новый узел
        }
    }

    // Метод для преобразования списка в строку для вывода
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" "); // Добавляем данные текущего узла к строке
            current = current.next; // Переходим к следующему узлу
        }
        return result.toString(); // Возвращаем строковое представление списка
    }

    // Метод для добавления нового узла в начало списка
    public void addFirst(int data) {
        createHead(data); // Вызываем метод createHead для добавления нового узла в начало списка
    }

    // Метод для добавления нового узла в конец списка
    public void addLast(int data) {
        createTail(data); // Вызываем метод createTail для добавления нового узла в конец списка
    }

    // Метод для вставки нового узла на указанную позицию в списке
    public void insert(int data, int position) {
        if (position < 0) { // Проверка корректности позиции
            System.out.println("Некорректная позиция");
            return;
        }
        if (position == 0) { // Вставка нового узла в начало списка
            createHead(data);
            return;
        }
        Node newNode = new Node(data, null); // Создаем новый узел с заданными данными
        Node current = head; // Указатель на текущий узел устанавливаем в начало списка
        int count = 0;
        while (current != null && count < position - 1) { // Ищем узел на позиции position - 1
            current = current.next;
            count++;
        }
        if (current == null) { // Если не удалось найти позицию
            System.out.println("Некорректная позиция");
            return;
        }
        newNode.next = current.next; // Вставляем новый узел между текущим узлом и следующим
        current.next = newNode;
    }

    // Метод для удаления первого узла из списка
    public void removeFirst() {
        if (head != null) { // Если список не пуст
            head = head.next; // Удаляем первый узел, сдвигая голову списка на следующий узел
        } else {
            System.out.println("Список пуст");
        }
    }

    // Метод для удаления последнего узла из списка
    public void removeLast() {
        if (head == null) { // Если список пуст
            System.out.println("Список пуст");
            return;
        }
        if (head.next == null) { // Если в списке только один узел
            head = null; // Удаляем его, устанавливая голову списка в null
            return;
        }
        Node current = head;
        while (current.next.next != null) { // Ищем предпоследний узел списка
            current = current.next;
        }
        current.next = null; // Удаляем последний узел, обнуляя ссылку на следующий узел предпоследнего
    }

    // Метод для удаления узла по указанной позиции в списке
    public void remove(int position) {
        if (position < 0 || head == null) { // Если список пуст или указана некорректная позиция
            System.out.println("Список пуст или некорректная позиция");
            return;
        }
        if (position == 0) { // Удаляем первый узел
            head = head.next;
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < position - 1) { // Ищем узел на позиции position - 1
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) { // Если не удалось найти позицию
            System.out.println("Некорректная позиция");
            return;
        }
        current.next = current.next.next; // Удаляем узел, обновляя ссылку предыдущего узла на следующий после удаляемого
    }
}
