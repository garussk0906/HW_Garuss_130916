package lr5.Example54;

public class Main_54 {
    public static void main(String[] args) {
        // Создание объектов с использованием различных конструкторов
        Test obj1 = new Test(65, 'A');
        Test obj2 = new Test(65.1267);

        // Вывод значений полей для проверки
        obj1.displayValues();
        obj2.displayValues();
    }
}
