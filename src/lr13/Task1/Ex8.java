package lr13.Task1;

public class Ex8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        try {
            System.out.println(m());
        } catch (RuntimeException e) {
            System.out.println("Exception caught in main(): " + e);
        }
    }
}
