package lr12.EnW;

import java.util.concurrent.*;

public class Ex5 {

    public static int findMax(int[] arr) {
        int threadsCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(threadsCount);
        Future<Integer>[] results = new Future[threadsCount];

        int chunkSize = arr.length / threadsCount;

        for (int i = 0; i < threadsCount; i++) {
            final int start = i * chunkSize;
            final int end = (i == threadsCount - 1) ? arr.length : (i + 1) * chunkSize;
            results[i] = executor.submit(() -> {
                int max = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
                return max;
            });
        }

        int globalMax = Integer.MIN_VALUE;
        try {
            for (Future<Integer> result : results) {
                int maxInChunk = result.get();
                if (maxInChunk > globalMax) {
                    globalMax = maxInChunk;
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
        return globalMax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 8, 4, 10, 3, 7, 5, 9};
        int max = findMax(arr);
        System.out.println("Максимальный элемент в массиве: " + max);
    }
}
