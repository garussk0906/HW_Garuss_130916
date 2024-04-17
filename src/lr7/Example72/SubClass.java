package lr7.Example72;

public class SubClass extends SuperClass {
    public int number;

    // Конструктор с двумя параметрами
    SubClass(int number, String text) {
        super(text);
        this.number = number;
    }

    // Переопределение метода setText из суперкласса
    @Override
    void setText(String text) {
        // Добавление префикса к тексту перед присваиванием
        super.setText("Prefix: " + text);
    }

    // Перегрузка метода setText с целочисленным параметром
    void setText(int number) {
        this.number = number;
    }

    // Перегрузка метода setText с текстовым и целочисленным параметром
    void setText(String text, int number) {
        // Объединение текста и числа перед присваиванием
        super.setText(text + " " + number);
    }
}
