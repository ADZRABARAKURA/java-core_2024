package laba1;

import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите год рождения: ");
        int birthYear = scanner.nextInt();

        int currentYear = 2023; // Текущий год

        int age = currentYear - birthYear;

        String message = "Привет, " + name + "! Вам " + age + " лет.";

        System.out.println(message);

        scanner.close();
    }
}
