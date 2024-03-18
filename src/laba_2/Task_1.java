package laba_2;
import java.util.Arrays;
import java.util.Random;
public class Task_1 {
    public static void main(String[] args) {
        // Размер массива
        int size = 10;

        // Создание массива и заполнение случайными числами
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        // Отображение массива в консольном окне
        System.out.println("Массив:");
        System.out.println(Arrays.toString(array));

        // Поиск минимального элемента и его индекса(ов)
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Вывод минимального значения и его индекса(ов)
        System.out.println("Минимальное значение: " + min);
        System.out.print("Индексы минимальных элементов: ");
        for (int i = 0; i < size; i++) {
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
