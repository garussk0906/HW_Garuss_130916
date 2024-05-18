package lr13.Task2;
import java.util.Scanner;

public class Exs3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            byte[] array = new byte[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Введите элемент " + (i + 1) + ": ");
                int num = scanner.nextInt();
                if (num < Byte.MIN_VALUE || num > Byte.MAX_VALUE) {
                    throw new IllegalArgumentException("Ошибка: введено значение за пределами диапазона типа byte!");
                }
                array[i] = (byte) num;
            }

            // Вычисление суммы элементов массива
            int sum = 0;
            for (byte b : array) {
                sum += b;
            }

            System.out.println("Сумма элементов массива: " + sum);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа!");

        } catch (java.lang.IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            scanner.close(); // Закрываем Scanner в блоке finally
        }
    }
}
