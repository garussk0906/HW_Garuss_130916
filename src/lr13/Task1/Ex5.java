package lr13.Task1;

public class Ex5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e);
        }
        System.out.println("2");
    }
}
