package laba1.timus_1582;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double k1, k2, k3;
        long a;

        k1 = scanner.nextDouble();
        k2 = scanner.nextDouble();
        k3 = scanner.nextDouble();

        a = Math.round(1000 / (1 / k1 + 1 / k2 + 1 / k3));

        System.out.println(a);
    }
}