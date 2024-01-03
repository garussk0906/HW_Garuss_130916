package lr4;

public class Example44 {
    public static void main(String[] args) {
        int rows = 7; // Количество строк прямоугольника
        int columns = 9; // Количество столбцов прямоугольника

        String[][] rectangle = new String[rows][columns]; // Создание двумерного массива

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rectangle[i][j] = "*";
            }
        }

        // Вывод
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
