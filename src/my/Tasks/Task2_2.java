package my.Tasks;

/**
 * Created by Smokorovskiy on 15.05.2016.
 */
public class Task2_2 {

    public static void main(String[] args) {

        System.out.println("Задача 2.2: Вывести название месяца по его номеру. Написать метод, который будет принимать на вход число и выводить стрингу. Пример: получили 7, вывели July.\n");

        for (int i = 1; i <= 12; i++) {
            System.out.println(numToString(i));
        }
    }

    private static String numToString(int num) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[--num];
    }
}
