package lr5.Example55;

public class Test {
    private int intValue;

    // Конструктор, который работает по тому же принципу, что и метод для присваивания значения полю
    public Test(int value) {
        setIntValue(value);
    }

    // Дополнительный конструктор без аргументов
    public Test() {
        setIntValue(0); // Если вызывается без аргументов, присваиваем значение 0
    }

    // Открытый метод для присваивания значения полю
    public void setIntValue(int value) {
        // Если переданное значение превышает 100, присваиваем значение 100
        this.intValue = Math.min(value, 100);
    }

    // Метод для проверки значения поля
    public int getIntValue() {
        return intValue;
    }
}
