package HomeWork.Hw_003;

import HomeWork.Hw_003.dataFiles.BookList;

import java.util.ArrayList;
import java.util.List;

/* 3. Сведения о книге состоят из названия, 
фамилии автора, цены, года издания 
и количества страниц. 
Найти названия книг, 
в которых простое количество страниц, 
фамилия автора содержит «А» 
и год издания после 2010 г, включительно.
 */

public class work003 {
    public static void main(String[] args) {

        String searchName = "а";
        String bookSortedNames = "";
        String bookSortedAutor = "";
        String bookSortedYear = "";

        List<BookList> listBook = new ArrayList<>();
        BookList book1 = new BookList(
                "7 навыков высокоэффективных людей",
                "Стивен Кови",
                549,
                2023,
                580);

        BookList book2 = new BookList(
                "Богатый папа, бедный папа",
                "Роберт Кийосаки",
                849,
                2011,
                239);

        BookList book3 = new BookList(
                "Атомные привычки",
                "Джеймс Клир",
                549,
                2018,
                251);

        BookList book4 = new BookList(
                "Важные годы",
                "Мэг Джей",
                449,
                2012,
                270);

        BookList book5 = new BookList(
                "Сила подсознания",
                "Джо Диспенза",
                549,
                2013,
                307);

        BookList book6 = new BookList(
                "Сила подсознания(первое издание)",
                "Джо Диспенза",
                549,
                2003,
                251);

        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        listBook.add(book4);
        listBook.add(book5);
        listBook.add(book6);

        /**
         * поиск названия книг,
         * в которых простое количество страниц,
         * фамилия автора содержит «А»
         * и год издания после 2010 г, включительно.
         */
        System.out.println();
        for (BookList items : listBook) {
            // поиск по количеству страниц
            if (PrimeNumber(items.getBookPages()) == true) {
                bookSortedNames += items.getBookPages() + " страниц " + "\n";
                // поиск по имени
                if (items.getBookAutor().toLowerCase().contains(searchName)) {
                    bookSortedAutor += items.getBookAutor() + " ->> " +
                            items.getBookPages() + " страниц " + "\n";
                    // поиск по году выпуска
                    if (items.getBookYearPublishing() >= 2010) {
                        bookSortedYear += items.getBookName() + " --> " +
                                items.getBookPages() + " страниц / " +
                                "Автор: " + items.getBookAutor() +
                                " / Год выпуска: " + items.getBookYearPublishing() + "\n";
                    }
                }
            }
        }

        // Вывод на печать
        System.out.println("Книги с простым количеством страниц: " + "\n" + bookSortedNames +
                "При этом авторы в имени которых встречается буква А " + "\n" + bookSortedAutor +
                "\n" + "Книги год выпуска которых после 2010(включительно): " + "\n" + bookSortedYear);

    }

    /**
     * @apiNote Проверка чилс на простоту
     * @param bookPages Принимает число для проверки
     * @return Выводит, прошло ли число проверку (истина/ложь)
     */
    private static boolean PrimeNumber(Integer bookPages) {

        for (int i = 2; i <= bookPages; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0 && i == bookPages) {
                    return false;
                }
            }
        }
        return true;
    }
}