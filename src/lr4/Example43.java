package lr4;

public class Example43 {
    public static void main(String[] args) {
        int rows = 7; // Количество строк прямоугольника
        int columns = 9; // Количество столбцов прямоугольника

        int[][] rectangle = new int[rows][columns]; // Создание двумерного массива

        // Заполнение массива значением 2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rectangle[i][j] = 2;
            }
        }

        // Вывод прямоугольника из цифр 2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
