package laba1.timus.task_1874;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = (Math.pow(a, 2) + Math.pow(b, 2)) / 4 + Math.sqrt(2) * a * b / 2;

        System.out.printf("%.6f\n", c);
    }
}