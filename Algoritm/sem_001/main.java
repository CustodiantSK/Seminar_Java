package Algoritm.sem_001;

import java.sql.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        task3();
    }

    // Написать алгоритм, считающий сумму всех чисел от 1 до n
    public static void task1() { // O(n/2) == O(n) == O(2n) -
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }

    // Необходимо вывести все простые числа от 2 до n
    public static void task2() { // O(n^2) + O(n) = O(n^2)
        int n = 1000;
        boolean flag;
        for (int i = 2; i <= n; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) { // если тру то зайди сюда
                System.out.print(i + " ");
            }
        }
        /*
         * for (int i = 0; i < 10; i++) {
         * // ..
         * }
         */
    }

    // написать алгоритм всех доступных комбинаций (посчитать количество)для кубиков
    // К с количеством граней N
    // 1 2 3 4 5 6
    // 4 3 2 1 1 1

    public static void task3() {
        int count = 4; // количество кубиков
        int faces = 6; // количество граней
        Date startData = new Date(System.currentTimeMillis()); /*
                                                                * старт проверка
                                                                * скорости отработки
                                                                */
        System.out.println(recursiveCount(1, count, faces));
        Date endData = new Date(System.currentTimeMillis()); /*
                                                              * стоп проверки
                                                              * скорости отработки
                                                              */
        Long chislo = endData.getTime() - startData.getTime(); /*
                                                                * время выполнения
                                                                * операции
                                                                */
        System.out.println(chislo + " ms"); // - вывод на кран
    }

    public static int recursiveCount(int countNow, int maxCount, int faces) { // O(k^n) -сложность
        int count = 0;
        for (int i = 0; i < faces; i++) {
            if (countNow == maxCount) {
                count++;
            } else {
                count += recursiveCount(countNow + 1, maxCount, faces);
            }
        }
        // for (int i = 0; i < faces; i++) { // O(n^4)
        // for (int j = 0; j < faces; j++) {
        // for (int j2 = 0; j2 < faces; j2++) {
        // for (int k = 0; k < faces; k++) {
        // count+=1;
        // }
        // }
        // }
        // }
        return count;
    }

    // Поиск нужного числа Фибоначчи
    // считаем что 1 и 2 значения последовательности равны 1
    public static void task4() {
        int n = 50;
        Date startData = new Date(System.currentTimeMillis());
        System.out.println(fb(n));
        Date endData = new Date(System.currentTimeMillis());
        Long chislo = endData.getTime() - startData.getTime();
        System.out.println("Время исполнения: " + chislo);

        Date startData2 = new Date(System.currentTimeMillis());
        System.out.println(fb2(n));
        Date endData2 = new Date(System.currentTimeMillis());
        Long chislo2 = endData2.getTime() - startData2.getTime();
        System.out.println("Время исполнения: " + chislo2);
        // 1 1 2 3
    }

    public static int fb(int num) { // O(2^n)
        // On = On-1 + On-2
        if (num <= 2) {
            return 1;
        } else {
            return fb(num - 1) + fb(num - 2);
        }
    }

    public static int fb2(int num) { // O(n)
        if (num <= 2) {
            return 1;
        }
        int[] numbers = new int[num];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[num - 1];
    }

}
