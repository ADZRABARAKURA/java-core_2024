package laba_2;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        System.out.println("Введите ключ (целое число от 1 до 25):");
        int key = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }
    }

    // Метод для шифрования текста
    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char shiftedChar = (char) (((Character.toUpperCase(character) - 'A' + key) % 26) + 'A');
                if (Character.isLowerCase(character))
                    shiftedChar = Character.toLowerCase(shiftedChar);
                result.append(shiftedChar);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }

    // Метод для расшифровки текста
    public static String decrypt(String text, int key) {
        return encrypt(text, 26 - key);
    }
}
