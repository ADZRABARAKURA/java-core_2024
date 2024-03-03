package laba1;

import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int firstNumber = number - 1;
        int secondNumber = number;
        int thirdNumber = number + 1;
        int sum = firstNumber + secondNumber + thirdNumber;
        int fourthNumber = sum * sum;

        System.out.println("Последовательность из четырех чисел: " + firstNumber + " " + secondNumber + " " + thirdNumber + " " + fourthNumber);

        scanner.close();
    }
}
