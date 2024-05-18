package lr13.Task2;

import java.util.Scanner;

public class Exs1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = Integer.parseInt(scanner.nextLine());

            if (size <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным числом.");
            }

            int[] array = new int[size];
            int sum = 0;
            int positiveCount = 0;

            for (int i = 0; i < size; i++) {
                System.out.print("Введите элемент " + (i + 1) + ": ");
                array[i] = Integer.parseInt(scanner.nextLine());

                if (array[i] > 0) {
                    sum += array[i];
                    positiveCount++;
                }
            }

            if (positiveCount == 0) {
                throw new IllegalStateException("Отсутствуют положительные элементы в массиве.");
            }

            double average = (double) sum / positiveCount;
            System.out.println("Среднее значение среди положительных элементов: " + average);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введена строка вместо числа.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Арифметическая ошибка при вычислении среднего значения.");
        } finally {
            scanner.close();
        }
    }
}

