package lr5.Example56;

public class Main_56 {
    public static void main(String[] args) {
        Test range1 = new Test(5, 10);
        Test range2 = new Test();

        System.out.println("Range1 values:");
        range1.displayRange();

        System.out.println("Range2 values:");
        range2.displayRange();

        range1.setRange(15, 8);
        range2.setRange(20, 5);

        System.out.println("Range1 values after setting (15, 8):");
        range1.displayRange();

        System.out.println("Range2 values after setting (20, 5):");
        range2.displayRange();
    }
}
