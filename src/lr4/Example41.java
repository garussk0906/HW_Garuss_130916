package lr4;

public class Example41 {
    public static void main(String[] args) {
        int width = 23; // Ширина прямоугольника
        int height = 11; // Высота прямоугольника
        int i;
        int j;

        for (i = 0; i < height; i++) {
            for (j = 0; j < width; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
