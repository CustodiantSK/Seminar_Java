package Seminar.sem_002;

public class task004 {
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        System.out.println("Палиндром = " + palindrom(myArray));
    }

    /**
     * @apinote Дан массив целых чисел. Верно ли, что массив является симметричным.
     * @param array
     * @return
     */

    private static String palindrom(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return "Не симметричен! ";
            }
        }
        return "Симметричен!";
    }
}
