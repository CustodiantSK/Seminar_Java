package HomeWork.Hw_003;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import HomeWork.Hw_003.dataFiles.Product;

/* 2. Сведения о товаре состоят из наименования, 
страны-производителя, веса, цены, сорта. 
Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class work002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сорт: ");
        Integer qual = sc.nextInt();
        sc.close();

        String priceSortedNames = "";
        Integer minPrice = 100000000;
        String minPriceNames = "";
        String country = "";

        List<Product> listProducts = new ArrayList<>();
        Product product1 = new Product(
                "Перловка",
                "Россия",
                1500,
                890,
                1);

        Product product2 = new Product(
                "Манка",
                "Беларусь",
                500,
                185,
                0);

        Product product3 = new Product(
                "Гречка",
                "Уругвай",
                850,
                802,
                2);

        Product product4 = new Product(
                "Рис",
                "Польша",
                231,
                1000,
                1);

        Product product5 = new Product(
                "Перловка",
                "Россия",
                2000,
                50,
                0);

        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);
        listProducts.add(product5);

        for (Product items : listProducts) {
            if (items.getproductSort() == qual) {
                priceSortedNames += items.getproductName() +
                        " --> произведено в " +
                        items.getproductManufacturerCountry() +
                        " --> Стоимостью: " +
                        items.getproductPrice() +
                        "\n";

                if (minPrice > items.getproductPrice()) {
                    minPrice = items.getproductPrice();
                    if (Objects.equals(items.getproductPrice(), minPrice)) {
                        minPriceNames = items.getproductName();
                        country = items.getproductManufacturerCountry();
                    }
                }

            }
        }

        System.out.println("Товары заданного сорта: ");
        System.out.println(priceSortedNames);
        System.out.println("Наименьшая цена: " + minPrice +
                ", у продукта: " + minPriceNames +
                " из " + country);
    }
}
