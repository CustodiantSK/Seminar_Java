package HomeWork.Hw_001;

import java.util.Scanner;

public class work002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Для окончания программы введите число 0 .");
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        while (num2 != 0) {
            System.out.print("Ваше число: ");
            num2 = sc.nextInt();
            if (isNumberPositive(num1, num2))
                sum = sum + num1;
            num1 = num2;
        }
        System.out.println("Сумма = " + sum);
    }

    /**
     * @apinote Дана последовательность целых чисел, оканчивающаяся нулем. Найти
     *          сумму
     *          положительных чисел, после которых следует отрицательное число.
     *          Пример ввода:
     *          1 2 1 2 -1 1 3 1 3 -1 0
     *          Логика расчета:
     *          2 -1 переход -> 2 в сумму
     *          3 -1 переход -> 3 в сумму
     *          Пример вывода: 5
     * @param a Предыдущее число
     * @param b Пользовательский ввод числа
     * @return сравнивает пользовательское число и предыдущее
     */

    public static boolean isNumberPositive(int a, int b) {
        return a >= 0 && b < 0;
    }

    //

}
