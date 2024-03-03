package laba1;

import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год рождения: ");
        int birthYear = scanner.nextInt();

        int currentYear = 2023; // Текущий год

        int age = currentYear - birthYear;

        String message;

        if (age < 0) {
            message = "Неверно введен год рождения.";
        } else if (age == 1) {
            message = "Вам " + age + " год.";
        } else if (age >= 2 && age <= 4) {
            message = "Вам " + age + " года.";
        } else {
            message = "Вам " + age + " лет.";
        }

        System.out.println(message);

        scanner.close();
    }
}
