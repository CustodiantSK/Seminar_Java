package Algoritm.sem_002.homework;

import java.util.Arrays;

public class HeapSort {
    public static void main(String args[]) {
        int arr[] = { 546, -50, 0, 66, 13, -50, -2, 54, 15, 80, 165, 4 };
        System.out.println("Ваш массив: ");
        System.out.println(Arrays.toString(arr));

        HeapSort object = new HeapSort();
        object.sort(arr);

        System.out.println("Сортированый массив: ");
        System.out.println(Arrays.toString(arr));
    }

    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[max])
            max = left;

        if (right < n && arr[right] > arr[max])
            max = right;

        if (max != i) {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;
            heapify(arr, n, max);
        }
    }
}
