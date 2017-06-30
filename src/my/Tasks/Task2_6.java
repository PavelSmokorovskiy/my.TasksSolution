package my.Tasks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Smokorovskiy on 25.05.2016.
 */
public class Task2_6 {

    public static void main(String[] args) {

        System.out.println("Задача 2.6: Дана строка с набором операций. Написать метод, который будет рассчитывать результат выполнения всех операций, учитывая приоритет операций. Операции только +,-,*,/.  Например: получаем на вход «2+5+9*10+10/5-12», возвращаем 87.\n");
        System.out.println("2 + 5 + 9 * 10 + 10 / 5 - 12 = " + calculator("2+5+9*10+10/5-12"));
    }

    //Это задание оказалось слишком сложным, поэтому нашел готовый код строчного калькулятора под даную задачу. Постараюсь разобраться, как он работает.
    private static double calculator(String expression) {

        expression = expression.replaceAll(" ", ""); //Нужны также дополнительные проверки на правильность ввода выражения

        //заполним список операндов numbers и список операций operations
        ArrayList<Double> numbers = new ArrayList<Double>();
        ArrayList<String> operations = new ArrayList<String>();

        Pattern p = Pattern.compile("[\\*\\-\\+\\/]"); //for operations
        Matcher m = p.matcher(expression);
        int lastFind = 0;
        while (m.find()) {
            if (m.start() > 0) {
                numbers.add(Double.parseDouble(expression.substring(lastFind, m.start())));
                operations.add(expression.substring(m.start(), m.end()));
                lastFind = m.end();
            }
        }
        numbers.add(Double.parseDouble(expression.substring(lastFind)));

//high priority operation: * and /
        for (int i = 0; i < operations.size(); i++) {
            if ("*".equals(operations.get(i))) {
                double op1 = numbers.get(i);
                double op2 = numbers.get(i + 1);
                numbers.set(i + 1, op1 * op2);
                numbers.remove(i);
                operations.remove(i);
                i--;
            } else if ("/".equals(operations.get(i))) {
                double op1 = numbers.get(i);
                double op2 = numbers.get(i + 1);
                numbers.set(i + 1, op1 / op2);
                numbers.remove(i);
                operations.remove(i);
                i--;
            }
        }
//low priority operation: + and -
        double res = numbers.get(0);
        for (int i = 0; i < operations.size(); i++) {
            res = res + Double.parseDouble(operations.get(i) + numbers.get(i + 1));
        }

        return res;
    }
}
