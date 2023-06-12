package HomeWork.Hw_002;

import java.util.Scanner;

public class work002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Выберете количество чисел: ");
        int n = sc.nextInt();
        System.out.println("Последовательность возрастает? " + upperNumbers(n, sc));
        sc.close();
    }

    /**
     * @apinote Дана последовательность из N целых чисел. Верно ли, что
     *          последовательность
     *          является возрастающей.
     * @param num Количество целых чисел в последовательности
     * @param in  Ввод числа
     * @return Возвращает: правду или ложь
     */
    private static boolean upperNumbers(int num, Scanner in) {
        System.out.print("Введите число: ");
        int num1 = in.nextInt();
        for (int i = 0; i < num - 1; i++) {
            System.out.print("Введите число: ");
            int num2 = in.nextInt();
            if (num2 < num1) {
                return false;
            }
            num1 = num2;
        }
        return true;
    }
}
