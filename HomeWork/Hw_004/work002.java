package HomeWork.Hw_004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class work002 {
    // 2)https://leetcode.com/problems/valid-parentheses/

    /**
     * Дана строка s, содержащая только символы '(', ')', '{', '}', '[' и ']',
     * определите, является ли входная строка допустимой.
     * 
     * Входная строка допустима, если:
     * 
     * Открытые скобки должны быть закрыты скобками того же типа.
     * Открытые скобки должны быть закрыты в правильном порядке.
     * Каждая закрывающаяся скобка имеет соответствующую открытую скобку того же
     * типа.
     * 
     * 
     * Пример 1:
     * 
     * Ввод: s = "()"
     * Вывод: true
     * Пример 2:
     * 
     * Ввод: s = "()[]{}"
     * Вывод: true
     * Пример 3:
     * 
     * Ввод: s = "(]"
     * Вывод: ложь
     * 
     * 
     * Ограничения:
     * 1 <= s.длина <= 104
     * s состоит только из круглых скобок '()[]{}'.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите символы: ");
        String s = sc.nextLine();
        int size = redactStr(s).length();
        int maxLength = 10 * 10 * 10 * 10;

        if (1 < size && size > maxLength)
            System.out.println("Данные вне диапазона!");
        else if (size == 1)
            System.out.println("Ввод: s = " + redactStr(s) + " --> нет пары!");
        else if (size > 1 && size < maxLength)
            System.out.println("Ввод: s = " + redactStr(s) + "\n" + "Вывод: " + valid(redactStr(s)));

        sc.close();
    }

    private static String redactStr(String s) {
        String filtered = s.trim().replaceAll("\\s+", " ");

        List<String> myList = new ArrayList<String>(Arrays.asList(filtered.split(" ")));

        String probel = "";
        String res = String.join(probel, myList);
        return res;
    }

    private static boolean valid(String s) {

        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

}
