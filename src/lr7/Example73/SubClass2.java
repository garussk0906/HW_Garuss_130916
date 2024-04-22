package lr7.Example73;

public class SubClass2 extends SubClass {
    public String text;

    // Конструктор с тремя параметрами
    public SubClass2(int x, char sym, String text) {
        super(x, sym);
        this.text = text;
    }
    // Перегрузка метода для присваивания значений полям
    public void setValue(int x, char sym, String text) {
        super.setValue(x, sym);
        this.text = text;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "SubClass: num=" + num + ", symbol=" + sym + ", text=" + text;
    }
}
