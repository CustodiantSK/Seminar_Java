package Seminar.sem_002;

import java.util.Scanner;

public class task007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int[] arrNum = { 4, 2, 5, 8, 4, 9, 3, 4, 2 };
        System.out.println("result = " + countElem(arrNum));
        sc.close();
    }

    /**
     * @apinote Дан массив целых чисел. Найти количество пар соседних элементов, где
     *          первый элемент вдвое больше второго.
     * @param arr Массив целых чисел
     * @return countN результат вычислений
     */

    public static int countElem(int[] arr) {
        int countN = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 2 * arr[i]) {
                countN += 1;
            }
        }
        return countN;
    }
}
