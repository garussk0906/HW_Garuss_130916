package lr7.Example72;

public class Main {
    public static void main(String[] args) {
        // Создание объекта суперкласса
        SuperClass superClass = new SuperClass("Hello");
        // Вызов метода для присваивания значения
        superClass.setText("World");
        // Вывод длины текста
        System.out.println("Length of text: " + superClass.getTextLength());

        // Создание объекта подкласса
        SubClass subClass = new SubClass(10, "Text");
        // Вызов метода для присваивания значения
        subClass.setText("New Text");
        // Вывод числа и текста
        System.out.println("Number: " + subClass.number + ", Text: " + superClass.getTextLength());

        // Вызов перегруженного метода для присваивания значения
        subClass.setText(20);
        // Вывод числа
        System.out.println("Number: " + subClass.number);

        // Вызов перегруженного метода для присваивания значения
        subClass.setText("Another Text", 30);
        // Вывод числа и текста
        System.out.println("Number: " + subClass.number + ", Text: " + superClass.getTextLength());
    }
}
