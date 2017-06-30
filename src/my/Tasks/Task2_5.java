package my.Tasks;

/**
 * Created by Smokorovskiy on 24.05.2016.
 */
public class Task2_5 {

    public static void main(String[] args) {

        System.out.println("Задача 2.5: Дано две строки. Определить является ли вторая строка подстрокой в строке. Для написания метода НЕ ИСПОЛЬЗОВАТЬ стандартные методы по работе с подстрокой Java. Пример: “abcdef” и “bcd”, метод должен ввернуть true.\n");
        System.out.println(isContains("Первая   строка", "строка"));
        System.out.println(isContainsSimple("Первая строка", "строку"));

    }

    //Использовал всё же стандартный метод String.
    private static boolean isContains(String firstString, String secondString) {

        char[] first = firstString.toCharArray();
        char[] second = secondString.toCharArray();

        int count = 0;

        for (char valSecond : second) {
            for (char valFirst : first) {
                if (valFirst == valSecond) {
                    count++;
                    break;
                }
            }
        }
        return count == second.length;
    }

    private static boolean isContainsSimple(String first, String second) {

        return first.contains(second);
    }
}
