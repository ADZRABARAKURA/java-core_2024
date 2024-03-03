package laba1;

import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название дня недели: ");
        String dayOfWeek = scanner.nextLine();

        System.out.println("Введите название месяца: ");
        String monthName = scanner.nextLine();

        System.out.println("Введите дату (число): ");
        int dayOfMonth = scanner.nextInt();

        System.out.printf("Сегодня %s, %d %s\n", dayOfWeek, dayOfMonth, monthName);
        scanner.close();
    }
}
