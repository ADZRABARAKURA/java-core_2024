package laba_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static List<String> filterStringsContainingSubstring(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> inputStrings = Arrays.asList(
                "AA1", "a1", "a1AA", "asas", "a111111", "man");
        String substring = "a1";

        List<String> result = filterStringsContainingSubstring(inputStrings, substring);

        System.out.println("Строки, содержащие подстроку \"" + substring + "\": " + result);
    }
}