package lr13.Task1;

public class Ex1 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("2");
    }
}
