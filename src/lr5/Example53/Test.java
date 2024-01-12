package lr5.Example53;

public class Test {
    private int firstNum;
    private int secNum;
    public Test() {
        this.firstNum = 0;
        this.secNum = 0;
    }
    public Test(int firstNum) {
        this.firstNum = firstNum;
        this.secNum = 0;
    }
    public Test(int firstNum, int secNum) {
        this.firstNum = firstNum;
        this.secNum = secNum;
    }
    public void displayNumbers() {
        System.out.println("First Number: " + firstNum);
        System.out.println("Second Number: " + secNum);
    }
}
