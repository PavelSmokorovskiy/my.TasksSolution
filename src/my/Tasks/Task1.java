package my.Tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Smokorovskiy on 11.05.2016.
 */
public class Task1 {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static int scale;
    private static int[] tempArray;
    private static int counter;

    public static void main(String... args) {

        scale = 70;
        tempArray = null;
        run();
    }

    private static void run() {

        System.out.println("Выберите № задачи (от 1 до 19): ");
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                System.out.println("Задача №1: Дано два числа. Найти минимальное число из них.");
                System.out.println("Введите первое число: ");
                int numberOne = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int numberTwo = scanner.nextInt();
                System.out.println("Минимальное значение из указанных чисел равняется: " + minNumber(numberOne, numberTwo));
                break;
            case 2:
                System.out.println("Задача №2: Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.");
                System.out.println("Введите размер массива:");
                System.out.println("Создан массив: " + Arrays.toString(tempArray = makeRandomArray(scanner.nextInt(), scale)));
                System.out.println("Введите число K: ");
                int k = scanner.nextInt();
                System.out.println("Сумма элементов, кратных " + k + " равняется: " + sumMultipleVal(tempArray, k));
                break;
            case 3:
                System.out.println("Задача №3: В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.");
                tempArray = new int[]{1, 2, 0, 0, 0, 6, 7, 0, 9, 0};
                System.out.println("Дан массив: " + Arrays.toString(tempArray));
                System.out.println("Массив номеров нулевых элементов равняется: " + Arrays.toString(zeroNumbers(tempArray)));
                break;
            case 4:
                System.out.println("Задача №4: Дан целочисленный массив чисел (положительных и отрицательных). Выяснить, какое число встречается раньше – положительное или отрицательное.");
                System.out.println("Введите размер массива:");
                System.out.println("Создан массив: " + Arrays.toString(tempArray = makeRandomArray(scanner.nextInt(), scale)));
                System.out.println("Первое значение массива " + signFirstNumber(tempArray));
                break;
            case 5:
                System.out.println("Задача №5: Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.");
                int[] sortArray = {1, 2, 3, 4, 5, 6, 7, 8, 29, 10};
                System.out.println("Дан массив: " + Arrays.toString(sortArray));
                System.out.println(isArraySort(sortArray) ? "Массив отсортирован" : "Массив не отсортирован");
                break;
            case 6:
                System.out.println("Задача №6: Дан массив чисел. Создать массив из четных чисел этого массива. Если таких чисел нет, то вывести сообщение об этом факте. ");
                System.out.println("Введите размер массива:");
                System.out.println("Создан массив: " + Arrays.toString(tempArray = makeRandomArray(scanner.nextInt(), scale)));
                System.out.println("Массив четных чисел: " + Arrays.toString(evenNumbers(tempArray)));
                break;
            case 7:
                System.out.println("Задача №7: Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать количество замен.");
                System.out.println("Введите размер массива:");
                System.out.println("Создан массив: " + Arrays.toString(tempArray = makeRandomArray(scanner.nextInt(), scale)));
                System.out.println("Введите число Z:");
                int z = scanner.nextInt();
                System.out.println("Новый массив: " + Arrays.toString(replaceNumbers(tempArray, z)));
                System.out.println("Количество замен: " + counter);
                break;
            case 8:
                System.out.println("Задача №8: Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.");
                System.out.println("Введите размер массива:");
                System.out.println("Создан массив: " + Arrays.toString(tempArray = makeRandomArray(scanner.nextInt(), scale)));
                tempArray = counterNumbers(tempArray);
                System.out.println("Количество положительных чисел: " + tempArray[0]);
                System.out.println("Количество отрицательных элементов: " + tempArray[1]);
                System.out.println("Количество нулевых элементов: " + tempArray[2]);
                break;
            case 9:
                System.out.println("Задача №9: Дан массив чисел. Поменять местами наибольший и наименьший элементы.");
                System.out.println("Введите размер массива:");
                System.out.println("Создан массив: " + Arrays.toString(tempArray = makeRandomArray(scanner.nextInt(), scale)));
                System.out.println("Новый массив: " + Arrays.toString(changeMinMaxValues(tempArray)));
                break;
            case 10:
                System.out.println("Задача №10: Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.");
                System.out.println("Введите размер массива:");
                System.out.println("Создан массив: " + Arrays.toString(tempArray = makeRandomArray(scanner.nextInt(), scale)));
                System.out.println("Введите число i:");
                int i = scanner.nextInt();
                System.out.println("Числа <= i: ");
                printLessNumbers(tempArray, i);
                break;
            case 11:
                System.out.println("Задача №11: Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.");
                System.out.println("Введите размер массива:");
                System.out.println("Создан массив: " + Arrays.toString(tempArray = makeRandomArray(scanner.nextInt(), scale)));
                System.out.println("Введите число M:");
                int m = scanner.nextInt();
                System.out.println("Введите число i:");
                int l = scanner.nextInt();
                System.out.println("Числа с остатком от деления L на число M: ");
                printRemDivNum(tempArray, m, l);
                break;
            case 12:
                System.out.println("Задача №12: Дан массив чисел.  Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)");
                System.out.println("Введите размер массива:");
                System.out.println("Создан массив: " + Arrays.toString(tempArray = makeRandomArray(scanner.nextInt(), scale)));
                System.out.println("Новый массив: " + Arrays.toString(swapNum(tempArray)));
                break;
            case 13:
                System.out.println("Задача №13: Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа, включительно до нуля.");
                tempArray = new int[]{1, 2, 3, 4, 5, 6, 7, 0, 9, 10};
                System.out.println("Дан массив: " + Arrays.toString(tempArray));
                System.out.println("Числа до 0: ");
                printNumToZero(tempArray);
                break;
            case 14:
                System.out.println("Задача №14: Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).");
                System.out.println("Введите размер массива:");
                System.out.println("Создан массив: " + Arrays.toString(tempArray = makeRandomArray(scanner.nextInt(), scale)));
                System.out.println("Сумма max even + min odd равняется: " + sumMinMax(tempArray));
                break;
            case 15:
                System.out.println("Задача №15: Дан массив целых положительных чисел. Найти произведение только тех чисел, которые больше заданного числа М. Если таких нет, то выдать сообщение об этом.");
                System.out.println("Введите размер массива:");
                System.out.println("Создан массив: " + Arrays.toString(tempArray = makeRandomArray(scanner.nextInt(), scale)));
                System.out.println("Введите число M:");
                int n = scanner.nextInt();
                System.out.println("Произведение чисел больше числа М равняется: " + productNum(tempArray, n));
                break;
            case 16:
                System.out.println("Задача №16: Дан массив положительных и отрицательных чисел.  Заменить нулями те числа, величина которых по модулю больше максимального числа (|a[i]| > max{ a[0], a[1], ..., a[n]})");
                tempArray = new int[]{1, -20, 3, -4, 5, -60, 7, -8, 9, -10};
                System.out.println("Дан массив: " + Arrays.toString(tempArray));
                System.out.println("Новый массив: " + Arrays.toString(zeroMoreThenMax(tempArray)));
                break;
            case 17:
                System.out.println("Задача №17: Дан массив чисел с положительными и отрицательными элементы. Вычислить произведение отрицательных элементов P1 и произведение положительных элементов Р2. Сравнить модуль Р2 с модулем Р1 и указать, какое из произведений по модулю больше.");
                System.out.println("Введите размер массива:");
                System.out.println("Создан массив: " + Arrays.toString(tempArray = makeRandomArray(scanner.nextInt(), scale)));
                tempArray = compareProductNum(tempArray);
                System.out.println("Произведение P1 равняется: " + tempArray[0]);
                System.out.println("Произведение P2 равняется: " + tempArray[1]);
                System.out.println(compareNumbers(tempArray));
                break;
            case 18:
                System.out.println("Задача №18: Дан массив чисел. Среди них есть равные. Найти первый максимальный элемент массива и заменить его нулем.");
                tempArray = new int[]{1, 2, 10, 4, 5, 10, 7, 8, 9, 10};
                System.out.println("Дан массив: " + Arrays.toString(tempArray));
                System.out.println("Измененный массив: " + Arrays.toString(zeroFirstMax(tempArray)));
                break;
            case 19:
                System.out.println("Задача №19: Дан массив чисел. Образовать новый массив, элементами которого будут элементы исходного, оканчивающиеся на цифру k.");
                System.out.println("Введите размер массива:");
                System.out.println("Создан массив: " + Arrays.toString(tempArray = makeRandomArray(scanner.nextInt(), scale)));
                System.out.println("Введите число k:");
                int j = scanner.nextInt();
                System.out.println("Массив с элементами оканчивающиеся на цифру k: " + Arrays.toString(lastK(tempArray, j)));
                break;
            default:
                System.out.println("Неверный ввод");
                break;
        }
    }

    //Task#1-1: Returns the minimum value of a pair of int numbers
    private static int minNumber(int a, int b) {
        return a < b ? a : b;
    }

    //Makes a random array
    static int[] makeRandomArray(int length, int scale) {

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(scale) - scale / 3;
        }
        return array;
    }

    //Task#1-2: Sums of numbers are multiples of the k value
    private static int sumMultipleVal(int array[], int k) {

        int sum = 0;
        for (int val : array) {
            if (val % k == 0) {
                sum += val;
            }
        }
        return sum;
    }

    //Task#1-3: Returns array of numbers of zero cells
    private static int[] zeroNumbers(int[] array) {

        int count = 0;
        for (int val : array) {
            if (val == 0) count++; //the counter of zero numbers
        }
        int[] res = new int[count];
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                res[pos] = i + 1;
                pos++;
            }
        }
        return res;
    }

    //Task#1-4: Returns name of sing the first value of the array
    private static String signFirstNumber(int[] array) {

        String sign;
        if (array[0] != 0) {
            if (array[0] > 0) sign = "положительное";
            else sign = "отрицательное";
        } else sign = "равняется нулю";

        return sign;
    }

    //Task#1-5: Returns true when the array is sorted
    private static boolean isArraySort(int[] array) {

        boolean res = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                res = false;
                break;
            }
        }
        return res;
    }

    //Task#1-6: Makes array of even numbers
    private static int[] evenNumbers(int[] array) {

        int count = 0;
        for (int val : array) if (val % 2 == 0) count++;
        int[] res = new int[count];
        count = 0;
        for (int n : array)
            if (n % 2 == 0) {
                res[count] = n;
                count++;
            }
        return res;
    }

    //Task#1-7: Replaces a number greater than the value K
    private static int[] replaceNumbers(int[] array, int z) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                counter++;
            }
        }
        return array;
    }

    //Task#1-8: Reduces the values of the array to Z value
    private static int[] counterNumbers(int[] array) {

        int[] res = new int[3];
        res[0] = 0;         //Counter positive numbers
        res[1] = 0;         //Counter negative numbers
        res[2] = 0;         //Counter zero numbers
        for (int n : array) {
            if (n > 0) res[0]++;
            else if (n < 0) res[1]++;
            else res[2]++;
        }
        return res;
    }

    //Task#1-9: Changes minimum and maximum values locations in the array
    private static int[] changeMinMaxValues(int[] array) {

        int max = array[0];
        int maxPosition = 0;
        int min = array[0];
        int minPosition = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxPosition = i;
            }
            if (array[i] < min) {
                min = array[i];
                minPosition = i;
            }
        }
        array[minPosition] = max;
        array[maxPosition] = min;
        return array;
    }

    //Task#1-10: Prints the numbers <= i
    private static void printLessNumbers(int[] array, int i) {

        for (int val : array) {
            if (val <= i) {
                System.out.print(val + ", ");
            }
        }
    }

    //Task#1-11: Prints the numbers with remainder of the division
    private static void printRemDivNum(int[] array, int m, int l) {

        for (int val : array) {
            if (val % m == l) {
                System.out.print(val + ", ");
            }
        }
    }

    //Task#1-12: Swaps neighboring elements
    private static int[] swapNum(int[] array) {

        int temp;
        for (int i = 1; i < array.length; i++) {
            if (i % 2 == 1) {
                temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }

    //Task#1-13: Prints the numbers to zero
    private static void printNumToZero(int[] array) {

        for (int val : array) {
            System.out.print(val + ", ");
            if (val == 0) {
                break;
            }
        }
    }

    //Task#1-14: Sums max and min values
    private static int sumMinMax(int[] array) {

        int max = array[0];
        int min = array[1];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                if (array[i] > max) {
                    max = array[i];
                }
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        return max + min;
    }

    //Task#1-15: Products the numbers greater than M
    private static int productNum(int[] array, int m) {

        int res = 1;
        for (int val : array) {
            if (val >= m) {
                res *= val;
            }
        }
        return res;
    }

    //Task#1-16: Replaces the numbers of zeros, which the value greater than maximum
    private static int[] zeroMoreThenMax(int[] array) {

        int max = array[0];
        for (int val : array) if (max < val) max = val;
        System.out.println(max);
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > max) array[i] = 0;
        }
        return array;
    }

    //Task#1-17.1: Calculates the product of negative elements P1 and the product of the positive elements.
    private static int[] compareProductNum(int[] array) {

        int[] res = {1, 1};
        for (int val : array) {
            if (val < 0) {
                res[0] *= val;
            } else {
                res[1] *= val;
            }
        }
        return res;
    }

    //Task#1-17.2: Compares module P2 to module P1 and return which of more than modulo
    private static String compareNumbers(int[] array) {

        return Math.abs(array[0]) > array[1] ? "P1 > P2" : "P1 < P2";
    }

    //Task#1-18: First maximum element replaces a zero
    private static int[] zeroFirstMax(int[] array) {

        int max = array[0];
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        array[indexMax] = 0;
        return array;
    }

    //Task#1-19: Makes new array with elements ending the digit K
    private static int[] lastK(int[] array, int k) {

        int count = 0;
        for (int val : array) {
            if (Math.abs(val) % 10 == k) {
                count++;
            }
        }
        int[] res = new int[count];
        int pos = 0;
        for (int val : array) {
            if (Math.abs(val) % 10 == k)
                res[pos++] = val;
        }
        return res;
    }
}

























