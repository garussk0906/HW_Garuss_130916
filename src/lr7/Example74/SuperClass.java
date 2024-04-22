package lr7.Example74;

public class SuperClass {
    public char sym;

    public SuperClass(char sym) {
        this.sym = sym;
    }

    // Конструктор создания копии
    public SuperClass(SuperClass original) {
        this.sym = original.sym;
    }
}
