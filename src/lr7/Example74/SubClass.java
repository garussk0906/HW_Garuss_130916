package lr7.Example74;

public class SubClass extends SuperClass {
    public String text;

    public SubClass(char sym, String text) {
        super(sym);
        this.text = text;
    }

    public SubClass(SubClass original) {
        super(original);
        this.text = text;
    }
}
