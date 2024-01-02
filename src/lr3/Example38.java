package lr3;

public class Example38 {
    public static void main(String[] args) {
        char[] consonantsArray = new char[10];
        int index = 0;
        char currentChar = 'A';

        while (index < 10) {
            if (currentChar != 'A' && currentChar != 'E' && currentChar != 'I') {
                consonantsArray[index] = currentChar;
                index++;
            }
            currentChar++;
        }

        System.out.println("Содержимое массива прописных согласных букв:");
        for (char c : consonantsArray) {
            System.out.print(c + " ");
        }
    }
}