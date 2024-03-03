package laba1;

import java.util.Scanner;
public class Example7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();

        String yearsText;

        if (age % 10 == 1 && age % 100 != 11) {
            yearsText = "год";
        } else if (age % 10 >= 2 && age % 10 <= 4 && (age % 100 < 12 || age % 100 > 14)) {
            yearsText = "года";
        } else {
            yearsText = "лет";
        }

        System.out.printf("Привет, %s! Вам %d %s.\n", name, age, yearsText);

        scanner.close();
    }

}
