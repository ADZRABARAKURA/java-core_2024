package laba_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static List<Integer> filterNumbersDivisibleBy(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> inputNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int divisor = 2;

        List<Integer> result = filterNumbersDivisibleBy(inputNumbers, divisor);

        System.out.println("Числа, делящиеся на " + divisor + " без остатка: " + result);
    }
}