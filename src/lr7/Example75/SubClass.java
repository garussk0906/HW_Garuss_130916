package lr7.Example75;

public class SubClass extends SuperClass {
    protected int num;

    public SubClass(String text, int num) {
        super(text);
        this.num = num;
    }

    @Override
    public void display() {
        System.out.println("Class: " + this.getClass().getSimpleName());
        System.out.println("Text: " + getText());
        System.out.println("Number: " + num);
    }
}
