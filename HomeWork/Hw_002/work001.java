package HomeWork.Hw_002;

import java.util.Scanner;

public class work001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Выберете количество чисел: ");
        int n = sc.nextInt();
        System.out.println("Сумма простых чисел = " + sumNumbers(n, sc));
        sc.close();
    }

    /**
     * @apinote Дана последовательность N целых чисел. Найти сумму простых чисел.
     * @param n Ввод количества проверяемых чисел
     * @return Проверка числа, простое или нет
     */
    private static boolean SimpleNumbers(int n) {
        if (n > 1) {
            for (int index = 2; index < n; index++) {
                if (n % index == 0) {
                    return false;
                }
            }
        } else if (n <= 1) {
            return false;
        }
        return true;
    }

    /**
     * @return Проверяет и возвращает сумму
     */
    private static int sumNumbers(int number, Scanner in) {
        int sumNum = 0;
        for (int i = 0; i < number; i++) {
            System.out.print("Введите число: ");
            int num = in.nextInt();
            if (SimpleNumbers(num) == true) {
                System.out.println(num + " - это простое число!");
                sumNum += num;
            }
        }
        return sumNum;
    }
}
