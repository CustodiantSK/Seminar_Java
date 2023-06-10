package Seminar.sem_001;

import java.util.Scanner;

public class task003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringNew = sc.nextLine();
        System.out.println("zadanie3(stringNew) = " + zadanie3(stringNew));
    }

    /**
     * @apiNote Дана строка. Поменять местами её половины
     * @param stringNew Исходная строка
     * @return Результирующая строка
     */
    private static String zadanie3(String stringNew) {
        String subStr1 = stringNew.substring(0, stringNew.length() / 2);
        String subStr2 = stringNew.substring(stringNew.length() / 2);
        return subStr2 + subStr1;
    }
}
