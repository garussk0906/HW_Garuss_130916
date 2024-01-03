package lr4;

import java.util.Scanner;

public class Example48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String inputText = in.nextLine().toUpperCase(); // Принимаем текст для шифрования и переводим в верхний регистр

        System.out.println("Введите ключ (число от 1 до 25):");
        int key = in.nextInt(); // Принимаем ключ для шифрования

        // Шифрование текста
        String encryptedText = encryptText(inputText, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        in.nextLine(); // Очистка буфера после ввода числа
        String response = in.nextLine().toLowerCase(); // Принимаем ответ пользователя

        if (response.equals("y")) {
            String decryptedText = decryptText(encryptedText, key);
            System.out.println("Обратное преобразование: " + decryptedText);
        } else if (response.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }
    }

    // Метод для шифрования текста
    public static String encryptText(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isLetter(currentChar)) {
                int shifted = ((currentChar - 'A') + key) % 26 + 'A';
                encryptedText.append((char) shifted);
            } else {
                encryptedText.append(currentChar);
            }
        }

        return encryptedText.toString();
    }

    // Метод для дешифрования текста
    public static String decryptText(String text, int key) {
        return encryptText(text, 26 - key); // Для обратного преобразования используем ключ 26 - исходный ключ
    }
}
