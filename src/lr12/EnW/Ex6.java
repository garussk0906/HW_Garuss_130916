package lr12.EnW;

import java.util.concurrent.*;

public class Ex6 {

    public static int sum(int[] arr) {
        int threadsCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(threadsCount);
        Future<Integer>[] results = new Future[threadsCount];

        int chunkSize = arr.length / threadsCount;

        for (int i = 0; i < threadsCount; i++) {
            final int start = i * chunkSize;
            final int end = (i == threadsCount - 1) ? arr.length : (i + 1) * chunkSize;
            results[i] = executor.submit(() -> {
                int sum = 0;
                for (int j = start; j < end; j++) {
                    sum += arr[j];
                }
                return sum;
            });
        }

        int totalSum = 0;
        try {
            for (Future<Integer> result : results) {
                totalSum += result.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int totalSum = sum(arr);
        System.out.println("Сумма элементов массива: " + totalSum);
    }
}
