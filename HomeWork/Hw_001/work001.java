package HomeWork.Hw_001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class work001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String s = sc.nextLine();

        System.out.println("Перевернутая фраза: " + perevorot(s));
    }

    /**
     * @apiNote Учитывая входную строку s, измените порядок слов в обратном порядке.
     *          Слово определяется как последовательность символов без пробелов.
     *          Слова в s
     *          будут разделены по крайней мере одним пробелом.
     *          Возвращает строку слов в обратном порядке, объединенную одним
     *          пробелом.
     *          Обратите внимание, что s может содержать начальные или конечные
     *          пробелы или
     *          несколько пробелов между двумя словами. Возвращаемая строка должна
     *          содержать
     *          только один пробел, разделяющий слова. Не включайте никаких
     *          дополнительных
     *          пробелов.
     * 
     *          1 <= s.длина <= 104
     *          s содержит английские буквы (прописные и строчные), цифры и пробелы
     *          ' '.
     *          В s есть по крайней мере одно слово.
     * @param s Пользовательский текст, разделенный пробелами
     * @return Возвращает перевернутый текст, последнее слово, станет первым и т.д.
     *         и убирает лишние пробелы
     */

    private static String perevorot(String s) {
        int maxLength = 140;
        if (s.length() > maxLength)
            s = s.substring(0, maxLength);

        String filtered = s.trim().replaceAll("\\s+", " ");

        List<String> myList = new ArrayList<String>(Arrays.asList(filtered.split(" ")));
        int j = myList.size();
        List<String> myListReverse = new ArrayList<String>();
        for (int i = 0; i < myList.size(); i++) {
            String item = myList.get(j - 1);
            myListReverse.add(i, item);
            j--;
        }
        String probel = " ";
        String res = String.join(probel, myListReverse);
        return res;
    }
}
