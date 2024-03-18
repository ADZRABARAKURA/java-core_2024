package laba_2;
import java.util.Arrays; // пакет для подключения классa Arrays
import java.util.Random; // пакет для подключения класса Random
import java.util.Scanner; // пакет для подключения классa Scanner
public class Example1 {
    public static void main(String[] args) {
        // Создание объекта класса Scanner для считывания числа введённого к консоль
        Scanner id = new Scanner(System.in);
        // Сообщение пользователю "для красоты и понимания"
        System.out.println("Введите размер массива");
        // Запись в переменную Size (нужная для того чтобы задать размер массива)
        int size = id.nextInt();
        //значения введенного в консоль
        System.out.println("Размер массива равен " + size);
        //Создание массива с размером введённым из консоли
        int[] nums = new int[size];
        // Создание объекта класса Random для генерации "случайного" числа
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            // Присвоение i-тому элементу массива случайного значения
            nums[i] = random.nextInt(200);
            // Сообщение пользователю "для красоты и понимания"
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }
        // Сортировка массива по возрастанию его элементов
        Arrays.sort(nums);
        // Сообщение пользователю "для красоты и понимания"
        System.out.println("Произведена сортировка массива");
        for (int i = 0; i < nums.length; i++) {
            // Сообщение пользователю "для красоты и понимания"
            System.out.println("Элемент массива [" + i + "] после сортировки = " + nums[i]);
        }
    }
}
