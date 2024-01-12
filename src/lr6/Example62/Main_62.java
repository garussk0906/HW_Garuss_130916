package lr6.Example62;

public class Main_62 {
    private static int counterValue = 0;

    public static void displayAndIncrement() {
        System.out.println("Current Counter Value: " + counterValue);
        counterValue++;
    }
    public static void main(String[] args) {
        Main_62.displayAndIncrement();
        Main_62.displayAndIncrement();
    }
}
