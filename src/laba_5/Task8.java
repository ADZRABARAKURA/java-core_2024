package laba_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
    public static List<Integer> filterNumbersGreaterThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> inputNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int threshold = 8;

        List<Integer> result = filterNumbersGreaterThan(inputNumbers, threshold);

        System.out.println("Числа, которые больше " + threshold + ": " + result);
    }
}
