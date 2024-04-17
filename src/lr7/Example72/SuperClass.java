package lr7.Example72;

public class SuperClass {
    private String text;

    // Конструктор с одним параметром
    SuperClass(String text) {
        this.text = text;
    }

    // Метод для присваивания значения полю text
    void setText(String text) {
        this.text = text;
    }

    // Метод для получения длины текстовой строки
    int getTextLength() {
        return text.length();
    }
}
