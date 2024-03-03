package laba1;

import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой возраст: ");
        int age = scanner.nextInt();

        int currentYear = 2023; // Текущий год

        int birthYear = currentYear - age;

        System.out.println("Ваш год рождения: " + birthYear);

        scanner.close();
    }
}
