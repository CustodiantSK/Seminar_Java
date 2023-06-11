package Seminar.sem_002;

import java.util.Scanner;

public class task006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("result = " + sumNumbers(n, sc));
        sc.close();
    }

    /**
     * @apinote Дана последовательность из N целых чисел. Найти сумму чисел,
     *          оканчивающихся на 5, перед которыми идет четное число.
     * @param number количество чисел
     * @param in     сканер
     * @return результат вычислений
     */

    private static int sumNumbers(int number, Scanner in) {
        int sumNum = 0;
        int firstNum = in.nextInt();
        for (int i = 0; i < number - 1; i++) {
            int num = in.nextInt();
            if (firstNum % 2 == 0 && num % 10 == 5) {
                sumNum += num;
            }
            firstNum = num;

        }
        return sumNum;
    }
}
