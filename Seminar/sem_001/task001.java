package Seminar.sem_001;

import java.util.Scanner;

public class task001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("zadanie1(n) = " + zadanie1(n));
    }

    /**
     * @apiNote Заданное целое число возвращает разность между произведением его
     *          цифр на сумму его цифр n
     * @param n входящее целочисленное число
     * @return результат выполнения задания
     */

    private static int zadanie1(int n) { // todo: Переименовать метод
        int multi = 1, sum = 0;
        while (n != 0) {
            int m = n % 10;
            multi *= m;
            sum += m;
            n /= 10;
        }
        return multi - sum;
    }
}
