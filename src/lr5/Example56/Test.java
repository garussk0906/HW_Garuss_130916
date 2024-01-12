package lr5.Example56;

public class Test {
    private int max;
    private int min;

    public Test(int value1, int value2) {
        setRange(value1, value2);
    }

    public Test() {
        setRange(0, 0);
    }

    public void setRange(int value1, int value2) {
        max = Math.max(value1, value2);
        min = Math.min(value1, value2);
    }

    public void displayRange() {
        System.out.println("Max Value: " + max);
        System.out.println("Min Value: " + min);
    }
}
