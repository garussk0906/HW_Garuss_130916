package lr7.Example75;

public class SuperClass {
    private  String text;

    public SuperClass(String text) {
        this.text = text;
    }

    // Метод для получения значения поля text
    public String getText() {
        return text;
    }

    // Метод для установки значения поля text
    public void setText(String text) {
        this.text = text;
    }

    // Метод для отображения названия класса и значения поля
    public void display() {
        System.out.println("Class: " + this.getClass().getSimpleName());
        System.out.println("Text: " + text);
    }
}
