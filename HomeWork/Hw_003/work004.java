package HomeWork.Hw_003;

import java.util.Arrays;
import java.util.List;

/* 4. Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее из этого списка. */
public class work004 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-5, 5, 48, 6, 44, 0, 88, 150, -55, 10, 4);
        int min = 999999999;
        int max = -999999999;
        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            // сумма значений
            sum += numbers.get(i);
            // поиск минимального
            if (numbers.get(i) < min) {
                min = numbers.get(i);
                // поиск максимального
            }
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        // подсчет среднего и сокращение значений до 2 знаков после запятой
        double avr = sum / numbers.size();
        double scale = Math.pow(10, 2);
        double result = Math.ceil(avr * scale) / scale;

        // вывод на печать
        System.out.println("Минимальное => " + min + "\n" +
                "Максимальное => " + max + "\n" +
                "среднее => " + result);
    }

}
