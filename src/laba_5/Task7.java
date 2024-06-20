package laba_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static List<String> filterStringsLongerThan(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> inputStrings = Arrays.asList(
                "all all all all", "1 2 3 4 5 6 7 ", "asasasasasas asasas", "a", "1", "2");
        int minLength = 10;

        List<String> result = filterStringsLongerThan(inputStrings, minLength);

        System.out.println("Строки, длина которых больше " + minLength + ": " + result);
    }
}
