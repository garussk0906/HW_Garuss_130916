package lr7.Example73;

public class SubClass extends SuperClass {
    public char sym;

    public SubClass(int x, char sym) {
        super(x); // Вызов конструктора суперкласса
        this.sym = sym;
    }

    public void setValue(int x, char sym) {
        super.setValue(x);
        this.sym = sym;
    }

    @Override
    public String toString() {
        return "SubClass: mum=" + num + "sym=" + sym;
    }
}