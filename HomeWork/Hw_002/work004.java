package HomeWork.Hw_002;

import java.util.Arrays;

public class work004 {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        char[] myArray = new char[board.length];
        System.out.println("Validete:" + isValidSudoku(board, myArray));
    }

    /**
     * Проверка массива на повторения
     * 
     * @param myArray1 Принимает заполненый массив для проверки на повторения
     * @return Возвращает результат проверок (повторения отсутсвуют(правда) или есть
     *         повторения(ложь))
     */
    public static boolean checkArray(char[] myArray1) {
        for (int i = 0; i < myArray1.length; i++) {
            for (int j = i + 1; j < myArray1.length; j++) {
                if (myArray1[i] != '.') {
                    if (myArray1[i] == myArray1[j]) {
                        System.out.println("Повторяющееся число: " + myArray1[i]);
                        System.out.println("Индекс повторного числа = " + j);
                        return false;
                    }
                }
            }
        }
        System.out.println("Повторений не обнаружено!");
        return true;
    }

    /**
     * Заполнение массива из столбца(матрицы)
     * 
     * @param board1   Принимает двумерный массив (судоку)
     * @param myArray2 Принимает пустой массив для заполнения и проверки на
     *                 повторения
     * @return Возвращает результат проверок (валидное(правда) или невалидное(ложь))
     */
    public static boolean checkColumnArray(char[][] board1, char[] myArray2) {
        for (int l = 0; l < board1.length; l++) {
            for (int k = 0; k < myArray2.length; k++) {
                myArray2[k] = board1[k][l];
            }
            System.out.println("massive" + Arrays.toString(myArray2));
            if (checkArray(myArray2) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Заполнение массива из строк(матрицы)
     * 
     * @param board2   Принимает двумерный массив (судоку)
     * @param myArray3 Принимает пустой массив для заполнения и проверки на
     *                 повторения
     * @return Возвращает результат проверок (валидное(правда) или невалидное(ложь))
     */
    public static boolean checkRowArray(char[][] board2, char[] myArray3) {
        for (int l = 0; l < board2.length; l++) {
            for (int k = 0; k < myArray3.length; k++) {
                myArray3[k] = board2[l][k];
            }
            System.out.println("massive" + Arrays.toString(myArray3));
            if (checkArray(myArray3) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Проверка матриц 3*3
     * 
     * @param board3   Принимает двумерный массив (судоку)
     * @param myArray5 Принимает пустой массив для заполнения и проверки на
     *                 повторения
     * @return Возвращает результат проверок (валидное(правда) или невалидное(ложь))
     */
    public static boolean checkBlockArray(char[][] board3, char[] myArray5) {
        int count = 0;
        for (int blockColumn = 0; blockColumn < board3.length; blockColumn = blockColumn + 3) {
            for (int blockRow = 0; blockRow < board3.length; blockRow = blockRow + 3) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (count < 9) {
                            count++;
                        } else {
                            System.out.println("massive" + Arrays.toString(myArray5));
                            if (checkArray(myArray5) == false) {
                                return false;
                            }
                            count = 1;
                        }
                        myArray5[count - 1] = board3[blockColumn + i][blockRow + j];
                        if (blockColumn == 6 && blockRow == 6 && i == 2 && j == 2) {
                            System.out.println("massive" + Arrays.toString(myArray5));
                            if (checkArray(myArray5) == false) {
                                return false;
                            }
                        }
                    }

                }
            }
        }
        return true;
    }

    /**
     * @apinote Отвалидировать доску судоку
     *          /Требования
     *          Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с
     *          правилами
     *          1. Каждая строка должна содержать цифру 1-9 без повторения
     *          2. Каждая колонка должна содержать цифру 1-9 без повторения
     *          3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9
     *          без
     *          повторения
     *          Ограничения
     *          • board.length == 9
     *          • board[i].length == 9
     *          • board[i][j] значение число или '.'
     * @param board4   Принимает двумерный массив (судоку)
     * @param myArray4 Принимает пустой массив для заполнения и проверки на
     *                 повторения
     * @return Возвращает результат проверок (валидное(правда) или невалидное(ложь))
     */
    // Проверка всей матрицы
    public static boolean isValidSudoku(char[][] board4, char[] myArray4) {
        if (board4 == null || board4.length != 9 || board4[0].length != 9)
            return false;

        // Проверка колонн
        System.out.println("Проверим колонны на повторения");
        if (checkColumnArray(board4, myArray4) == false) {
            System.out.println();
            System.out.println("--- Судоку Невалидно! ---");
            return false;
        }
        System.out.println();

        // Проверка строк
        System.out.println("Проверим строки на повторения");
        if (checkRowArray(board4, myArray4) == false) {
            System.out.println();
            System.out.println("--- Судоку Невалидно! ---");
            return false;
        }
        System.out.println();

        // Проверка матриц 3*3
        System.out.println("Проверим блоки 3*3 на повторения");
        if (checkBlockArray(board4, myArray4) == false) {
            System.out.println();
            System.out.println("--- Судоку Невалидно! ---");
            return false;
        }
        System.out.println();

        System.out.println("*** Судоку Валидно! ***");
        return true;
    }

}
