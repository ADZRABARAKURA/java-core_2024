package laba_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {
    public static List<Integer> filterNumbersLessThan(List<Integer> numbers, int max) {
        return numbers.stream()
                .filter(n -> n < max)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> inputNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int max = 6;

        List<Integer> result = filterNumbersLessThan(inputNumbers, max);

        System.out.println("Числа, которые меньше " + max + ": " + result);
    }
}