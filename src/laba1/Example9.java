package laba1;

import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String monthName = scanner.nextLine();

        System.out.println("Введите количество дней: ");
        int daysInMonth = scanner.nextInt();

        String message;

        switch (monthName.toLowerCase()) {
            case "февраль":
                if (daysInMonth == 28 || daysInMonth == 29) {
                    message = "В " + monthName + " может быть " + daysInMonth + " дней.";
                } else {
                    message = "В " + monthName + " не может быть " + daysInMonth + " дней.";
                }
                break;
            case "апрель":
            case "июнь":
            case "сентябрь":
            case "ноябрь":
                if (daysInMonth == 30) {
                    message = "В " + monthName + " может быть " + daysInMonth + " дней.";
                } else {
                    message = "В " + monthName + " не может быть " + daysInMonth + " дней.";
                }
                break;
            case "январь":
            case "март":
            case "май":
            case "июль":
            case "август":
            case "октябрь":
            case "декабрь":
                if (daysInMonth == 31) {
                    message = "В " + monthName + " может быть " + daysInMonth + " дней.";
                } else {
                    message = "В " + monthName + " не может быть " + daysInMonth + " дней.";
                }
                break;
            default:
                message = "Неверно введено название месяца.";
        }

        System.out.println(message);

        scanner.close();
    }
}
