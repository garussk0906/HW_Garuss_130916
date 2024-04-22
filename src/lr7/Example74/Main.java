package lr7.Example74;

public class Main {
    public static void main(String[] args) {
        // Создание объекта третьего класса
        SubClass2 obj1 = new SubClass2('A', "Hello", 10);

        // Создание копии объекта
        SubClass2 obj2 = new SubClass2(obj1);

        // Вывод информации о первом объекте
        System.out.println("First Object:");
        System.out.println("Symbol: " + obj1.sym);
        System.out.println("Text: " + obj1.text);
        System.out.println("Number: " + obj1.num);

        // Вывод информации о втором объекте (копии)
        System.out.println("\nSecond Object (Copy):");
        System.out.println("Symbol: " + obj2.sym);
        System.out.println("Text: " + obj2.text);
        System.out.println("Number: " + obj2.num);
    }
}
