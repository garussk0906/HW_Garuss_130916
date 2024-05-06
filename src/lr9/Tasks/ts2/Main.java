package lr9.Tasks.ts2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Запрос числа у пользователя
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число для перевода в двоичную систему: ");
        int decimal = sc.nextInt();
        sc.close();

        // Печать двоичного представления числа
        System.out.println("Двоичное представление числа " + decimal + ": " + decimalToBinary(decimal));
    }

    // Метод для перевода целого числа в двоичную систему счисления с использованием рекурсии
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0"; // Базовый случай: если число равно 0, возвращаем "0"
        } else if (decimal == 1) {
            return "1"; // Базовый случай: если число равно 1, возвращаем "1"
        } else {
            // Рекурсивно вызываем метод для частного от деления на 2 и добавляем остаток от деления
            return decimalToBinary(decimal / 2) + decimal % 2;
        }
    }
}
