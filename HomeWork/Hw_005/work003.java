package HomeWork.Hw_005;

import java.util.HashMap;
import java.util.Map;

public class work003 {
    /*
     * Подсчитать количество вхождения каждого слова
     * Пример:
     * Россия идет вперед всей планеты. Планета — это не Россия.
     * toLoverCase().
     * (Усложнение - игнорировать пунктуацию)*
     * 2) Подсчитать количество искомого слова, через map (наполнением значение, где
     * искомое слово будет являться ключом), вносить все слова не нужно
     */
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1() {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        System.out.println("Фраза: " + "\n" + text);
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }
        String[] arrayText = text.split(" ");

        Map<String, Integer> map = getCountWords(arrayText);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static Map<String, Integer> getCountWords(String[] array) {
        Map<String, Integer> map = new HashMap<>();

        for (String current : array) {
            int count = map.getOrDefault(current.toLowerCase(), 0);
            map.put(current.toLowerCase(), ++count);
        }

        return map;
    }
}
