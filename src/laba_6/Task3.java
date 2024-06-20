package laba_6;

public class Task3 {
    public static void main(String[] args) {
        Thread threadEven = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Четный поток: " + i);
            }
        });

        Thread threadOdd = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Нечетный поток: " + i);
            }
        });

        threadEven.start();
        threadOdd.start();

        try {
            threadEven.join();
            threadOdd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}