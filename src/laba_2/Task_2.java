package laba_2;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        int rows = 4; // количество строк
        int cols = 5; // количество столбцов

        // Создание и заполнение двумерного массива "змейкой"
        int[][] array = new int[rows][cols];
        int value = 1; // начальное значение для заполнения массива

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // если четная строка, заполняем слева направо
                for (int j = 0; j < cols; j++) {
                    array[i][j] = value++;
                }
            } else {
                // если нечетная строка, заполняем справа налево
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = value++;
                }
            }
        }

        // Вывод массива на экран
        System.out.println("Двумерный массив \"змейкой\":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
