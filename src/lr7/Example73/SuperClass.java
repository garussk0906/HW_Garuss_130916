package lr7.Example73;

public class SuperClass {
    public int num;

    public SuperClass(int x) {
        this.num = x;
    }

    // Метод для присваивания значения полю
    public void setValue(int x) {
        this.num = x;
    }

    // Метод toString() для вывода информации о классе
    @Override
    public String toString() {
        return "SuperClass: num=" + num;
    }
}