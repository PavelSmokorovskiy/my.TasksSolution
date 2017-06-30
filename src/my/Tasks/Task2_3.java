package my.Tasks;

import java.util.Arrays;

/**
 * Created by Smokorovskiy on 15.05.2016.
 */
public class Task2_3 {

    public static void main(String[] args) {

        System.out.println("Задача 2.3: Дан массив букв. Вывести массив, где все большие буквы будут заменены на маленькие. Пример: получили {‘a’, ‘Z’, ‘E’, ‘d’}, вывели {‘a’, ‘z’, ‘e’, ‘d’}.\n");

        char[] array = {'a', 'Z', 'E', 'd'};

        System.out.println("Дан массив:               " + Arrays.toString(array));
        System.out.println("Массив в нижнем регистре: " + Arrays.toString(toLowerCase(array)));
    }

    private static char[] toLowerCase(char[] array) {

        char[] upperCase = {'A', 'Z', 'E', 'D'};
        char[] lowerCase = {'a', 'z', 'e', 'd'};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < upperCase.length; j++) {
                if (array[i] == upperCase[j]) {
                    array[i] = lowerCase[j];
                }
            }
        }
        return array;
    }


}
