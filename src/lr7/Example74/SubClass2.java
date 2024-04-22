package lr7.Example74;

public class SubClass2 extends SubClass {
    public int num;

    public SubClass2 (char sym, String text, int num) {
        super(sym, text);
        this.num = num;
    }

    public SubClass2(SubClass2 original) {
        super(original);
        this.num = original.num;
        this.text = original.text;
    }
}
