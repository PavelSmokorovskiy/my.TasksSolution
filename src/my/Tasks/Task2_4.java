package my.Tasks;

/**
 * Created by Smokorovskiy on 15.05.2016.
 */
public class Task2_4 {

    public static void main(String[] args) {

        System.out.println("Задача 2.4: Дано число. Вывести все простые числа в диапазоне от 2 до этого числа включительно.\n");
        fibonacci(15);
    }

    private static void fibonacci(int num) {

        int res;
        int a = 1;
        int b = 1;

        for (int i = 2; i <= num; i++) {

            res = a + b;
            a = b;
            b = res;
            System.out.println(i + "-ый элемент = " + res);
        }
    }

}
