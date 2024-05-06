package lr9.Tasks.ts3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Запрашиваем у пользователя размер массива
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();

        // Создаем массив указанного размера
        int[] array = new int[size];

        // Заполняем массив
        inputArray(array, 0, sc);

        // Выводим массив
        System.out.println("Введенный массив:");
        outputArray(array, 0);

        sc.close();
    }

    // Рекурсивный метод для ввода элементов массива
    public static void inputArray(int[] array, int index, Scanner scanner) {
        if (index < array.length) {
            System.out.print("Введите элемент массива [" + index + "]: ");
            array[index] = scanner.nextInt();
            inputArray(array, index + 1, scanner);
        }
    }

    // Рекурсивный метод для вывода элементов массива
    public static void outputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.println("Элемент массива [" + index + "]: " + array[index]);
            outputArray(array, index + 1);
        }
    }
}
