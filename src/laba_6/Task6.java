package laba_6;

import java.util.Random;
import java.util.concurrent.*;

public class Task6 {
    public static void main(String[] args) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        int[] array = createRandomArray(1000);

        Future<Integer>[] futures = new Future[numThreads];
        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i;
            futures[i] = executor.submit(() -> {
                int sum = 0;
                for (int j = threadIndex; j < array.length; j += numThreads) {
                    sum += array[j];
                }
                return sum;
            });
        }

        int totalSum = 0;
        try {
            for (Future<Integer> future : futures) {
                totalSum += future.get();
            }
            System.out.println("Сумма элементов массива: " + totalSum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }

    private static int[] createRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); // случайные числа от 0 до 999
        }
        return array;
    }
}