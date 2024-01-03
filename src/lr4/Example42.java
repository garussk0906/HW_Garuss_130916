package lr4;

public class Example42 {
    public static void main(String[] args) {
        int rows = 10;
        int i;
        int j;

        for (i = 1; i < rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}