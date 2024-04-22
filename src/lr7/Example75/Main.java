package lr7.Example75;

public class Main {
    public static void main(String[] args) {
        // Создание объекта первого подкласса
        SubClass obj1 = new SubClass("Hello", 10);
        // Создание объекта второго подкласса
        SubClass2 obj2 = new SubClass2("World", 'A');

        // Проверка работы метода display() для каждого объекта
        System.out.println("Displaying obj1:");
        obj1.display();
        System.out.println();

        System.out.println("Displaying obj2:");
        obj2.display();
        System.out.println();

        // Вызов метода display() через объектную переменную суперкласса,
        // которая ссылается на объект первого подкласса
        SuperClass obj3 = new SubClass("Java", 20);
        System.out.println("Displaying obj3:");
        obj3.display();
    }
}
