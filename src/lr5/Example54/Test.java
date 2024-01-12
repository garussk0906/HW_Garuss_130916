package lr5.Example54;

public class Test {
    private String charField;
    private int intField;

    // Конструктор с двумя аргументами (целое число и символ)
    public Test(int intValue, char charValue) {
        this.intField = intValue;
        this.charField = String.valueOf(charValue);
    }

    // Конструктор с одним аргументом типа double
    public Test(double doubleValue) {
        int intValue = (int) doubleValue; // Целая часть определяет значение целочисленного поля
        char charValue = (char) intValue; // Целая часть определяет код символа
        this.intField = intValue;
        this.charField = String.valueOf(charValue);
    }

    // Метод для вывода значений полей в консоль (для тестирования)
    public void displayValues() {
        System.out.println("Character Field: " + charField);
        System.out.println("Integer Field: " + intField);
    }
}
