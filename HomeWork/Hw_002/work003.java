package HomeWork.Hw_002;

import java.util.Arrays;

public class work003 {
    public static void main(String[] args) {
        int[] oneArray = { 1, 22, 33, 44, 5, -5, -3, 23, -7 };
        System.out.println("Массив до замены: " + Arrays.toString(oneArray));
        System.out.println("Массив после замены: " + Arrays.toString(newArray(oneArray)));
    }

    /**
     * @apinote Дан массив целых чисел. Заменить отрицательные элементы на сумму
     *          индексов
     *          двузначных элементов массива.
     *          Пример:
     *          Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
     *          Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
     *          Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13,
     *          13, 23,
     *          13}
     * @param arr2 Меняет двузначные элементы массива на сумму индексов
     * @return возвращает замененный массив
     */
    public static int[] newArray(int[] arr2) {
        int ind = sumIndArray(arr2);
        System.out.println("Сумма индексов: " + ind);
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 0) {
                arr2[i] = ind;
            }
        }
        return arr2;
    }

    /**
     * @param arr Суммирует индексы двузначных элементов массива
     * @return Возвращает сумму индексов
     */
    public static int sumIndArray(int[] arr) {
        int sumIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 9 || arr[i] < -9) {
                sumIndex += i;
            }
        }
        return sumIndex;
    }
}
