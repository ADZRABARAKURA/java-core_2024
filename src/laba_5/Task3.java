package laba_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static List<String> filterStringsStartingWithUppercase(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> inputStrings = Arrays.asList(
                "1", "HI", "Java", "2", "Apple", "example");

        List<String> result = filterStringsStartingWithUppercase(inputStrings);

        System.out.println("Отфильтрованные строки: " + result);
    }
}