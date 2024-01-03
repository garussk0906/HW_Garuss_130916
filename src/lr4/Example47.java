package lr4;

public class Example47 {
    public static void main(String[] args) {
        int rows = 5; // Количество строк
        int columns = 4; // Количество столбцов

        int[][] snakeArray = new int[rows][columns];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) { // Направление заполнения вправо для четных строк
                for (int j = 0; j < columns; j++) {
                    snakeArray[i][j] = value++;
                }
            } else { // Направление заполнения влево для нечетных строк
                for (int j = columns - 1; j >= 0; j--) {
                    snakeArray[i][j] = value++;
                }
            }
        }

        // Вывод массива
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(snakeArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
