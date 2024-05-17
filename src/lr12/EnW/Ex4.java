package lr12.EnW;

public class Ex4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i; // используем final для доступа внутри лямбда-выражения
            Thread thread = new Thread(() -> {
                System.out.println("Thread number: " + threadNumber);
            });

            thread.start();
        }
    }
}