package HomeWork.Hw_003;

import java.util.Arrays;

/* 5*) при входном массиве, 
вернуть массив массивов 
со всеми перестановками его элементов. (со звездочкой)
Пример входных данных:
[1,2,3]
Пример выходных данных:
[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]] */

// НЕ решено!!!!

public class work005 {
    public static void main(String[] args) {
        int firstMass[] = new int[] { 1, 2, 3 };

        permute(firstMass, firstMass.length);
    }

    private static void permute(int[] arr, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int k = 0; k < size; k++) {
                swap(arr, k, size - 1);
                permute(arr, size - 1);
                swap(arr, size - 1, k);
            }
        }
    }

    private static void swap(int[] arr, int k, int i) {
        int tmp = arr[k];
        arr[k] = arr[i];
        arr[i] = tmp;
    }
}
