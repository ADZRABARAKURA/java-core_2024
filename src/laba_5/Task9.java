package laba_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static List<String> filterStringsOnlyLetters(List<String> strings) {
        return strings.stream()
                .filter(s -> s.matches("[a-zA-Z]+")) // проверяем, что строка состоит только из букв
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> inputStrings = Arrays.asList(
                "1", "1a", "a1", "all", "task", "asas");

        List<String> result = filterStringsOnlyLetters(inputStrings);

        System.out.println("Строки, содержащие только буквы: " + result);
    }
}
