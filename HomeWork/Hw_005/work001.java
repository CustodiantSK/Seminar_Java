package HomeWork.Hw_005;

import java.util.HashMap;
import java.util.Map;

public class work001 {
    /*
     * 1) Подсчитать количество искомого слова, через map (наполнением значение, где
     * искомое слово будет являться ключом), вносить все слова не нужно
     * Пример:
     * Россия идет вперед всей планеты. Планета — это не Россия.
     * Запрос: Россия
     * Ответ: Россия - 2
     * toLoverCase().
     * (Усложнение - игнорировать пунктуацию)
     */
    public static void main(String[] args) {
        searchText();
    }

    public static void searchText() {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        System.out.println("Фраза: " + "\n" + text);
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }

        String findWord = "Россия";

        String[] arrayText = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String currentWord : arrayText) {
            if (!findWord.toLowerCase().equals(currentWord.toLowerCase())) {
                continue;
            }

            int count = map.getOrDefault(findWord.toLowerCase(), 0);
            map.put(currentWord.toLowerCase(), ++count);
        }

        System.out.println("Количество искомого слова ('Россия'): " + map.getOrDefault(findWord.toLowerCase(), 0));
    }
}
