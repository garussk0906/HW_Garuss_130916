package lr5.Example51;

public class Test {
    private char ch1;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }
    public int getCodeSymbol() {
        return ch1;
    }
    public void showCodeAndValue() {
        System.out.println("Value = " + ch1);
        System.out.println("Code = " + (int) ch1);
    }
}
