package Seminar.sem_001;

import java.util.Scanner;

public class task002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Количество цифр = " + n);
        int counter = 0;
        int num1 = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num2 = sc.nextInt();
            if (isNumberPositive(num1, num2)) {
                counter++;
            }
            num1 = num2;
        }
        // String b = sc.next();
        System.out.println("count = " + counter);
    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти количество
     *          положительных чисел, после которых следует отрицательное число.
     * @param a Первое число
     * @param b Следующее число
     * @return Количество положительных чисел
     */
    public static boolean isNumberPositive(int a, int b) {
        return a >= 0 && b < 0;
    }
}
