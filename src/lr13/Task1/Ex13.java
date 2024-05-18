package lr13.Task1;

public class Ex13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива = " + l);

            // Проверка на нулевой размер массива
            if (l == 0) {
                throw new ArithmeticException("Деление на ноль");
            }

            int h = 10 / l;
            args[l + 1] = "10";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }
}
