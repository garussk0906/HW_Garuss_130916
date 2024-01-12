package lr5.Example55;

public class Main_55 {
    public static void main(String[] args) {
        Test obj1 = new Test(75);
        Test obj2 = new Test();

        System.out.println("Value of obj1: " + obj1.getIntValue());
        System.out.println("Value of obj2: " + obj2.getIntValue());

        obj1.setIntValue(120);
        obj2.setIntValue(50);

        System.out.println("Value of obj1 after setting 120: " + obj1.getIntValue());
        System.out.println("Value of obj2 after setting 50: " + obj2.getIntValue());
    }
}
