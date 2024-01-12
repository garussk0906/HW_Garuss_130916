package lr5.Example53;

public class Main_53 {
    public static void main(String[] args) {
        Test obj1 = new Test();
        Test obj2 = new Test(5);
        Test obj3 = new Test(10, 20);

        obj1.displayNumbers();
        obj2.displayNumbers();
        obj3.displayNumbers();
    }
}
