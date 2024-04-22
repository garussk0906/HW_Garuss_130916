package lr7.Example75;

public class SubClass2 extends SuperClass {
    protected char sym;

    public SubClass2(String text,char sym) {
        super(text);
        this.sym = sym;
    }
    @Override
    public void display() {
        System.out.println("Class: " + this.getClass().getSimpleName());
        System.out.println("Text: " + getText());
        System.out.println("Symbol: " + sym);
    }
}
