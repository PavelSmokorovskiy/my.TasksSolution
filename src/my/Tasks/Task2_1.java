package my.Tasks;

import java.util.Arrays;

/**
 * Created by Smokorovskiy on 15.05.2016.
 */
public class Task2_1 {

    public static void main(String[] args) {

        System.out.println("Задача 2.1: Дан массив чисел. Отсортировать массив по возрастанию.\n");
        int[] tempArray = Task1.makeRandomArray(15, 50);
        System.out.println("Создан массив: " + Arrays.toString(tempArray));
        System.out.println("Произведена сортировка пузырьком: " + Arrays.toString(bubbleSort(tempArray)));
        System.out.println("Произведена сортировка выбором:   " + Arrays.toString(selectionSort(tempArray)));
    }

    private static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    private static int[] selectionSort(int[] array) {

        for (int min = 0; min < array.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int temp = array[min];
            array[min] = array[least];
            array[least] = temp;
        }
        return array;
    }
}
