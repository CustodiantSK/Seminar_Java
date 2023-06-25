package HomeWork.Hw_003;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

import HomeWork.Hw_003.dataFiles.Product;

/* 1. Дан массив записей: наименование товара, цена, сорт. 
Найти наибольшую цену товаров 1го или 2-го сорта 
среди товаров, название которых содержит «высший».
 */
public class work001 {
    public static void main(String[] args) {
        Random random = new Random();
        Product product1 = new Product(
                "Cредний",
                "Россия",
                1500,
                8990,
                random.nextInt(1));
        Product product2 = new Product(
                "Cредний",
                "Беларусь",
                500,
                18590,
                random.nextInt(1));
        Product product3 = new Product(
                "Высший",
                "Уругвай",
                850,
                80234,
                random.nextInt(1));
        Product product4 = new Product(
                "Высший",
                "Польша",
                231,
                1000,
                random.nextInt(1));
        Product product5 = new Product(
                "Низкий",
                "Россия",
                2000,
                50,
                random.nextInt(1));

        List<Product> listProducts = new ArrayList<>();
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);
        listProducts.add(product5);

        String search = "высший";
        Integer maxPrice = 0;
        String maxPriceSortedNames = "";

        for (Product product : listProducts) {
            if (Product.getproductName().toLowerCase().contains(search)
                    && (Product.getproductSort() == 1 || Product.getproductSort() == 2)) {
                if (maxPrice < Product.getproductPrice()) {
                    maxPrice = Product.getproductPrice();
                }
            }
        }

        for (Items items : itemsList) {
            if (items.getName().toLowerCase().contains(search) && (items.getSort() == 1 || items.getSort() == 2)) {
                if (Objects.equals(items.getPrice(), maxPrice)) {

                    maxPriceSortedNames += items.getName() + "\n";
                }
            }
        }
        System.out.println("Самые дорогие товары первого и второго сорта, в названии которых есть слово 'высший': ");
        System.out.println(maxPriceSortedNames);
        System.out.println("Наибольшая цена: " + maxPrice);

    }
}
/*
 * 
 * 
 * String search = 'высший';
 * Set<String> setPrices = new HashSet<>();
 * 
 * // Находим цену нужного товара и добавляем в сет
 * for (int i=0; i <listProducts.size(); i++) {
 * if (listProducts.get(1).getName().equals(search)) {
 * setPrices.add(listProducts.get(i).getPrice());
 * }
 * }
 * 
 * // Находим максимальную цену и выводим её
 * int max = 0;
 * for (int i = 0; i < setPrices.length; i++) {
 * if (setPrices[i] > max) {
 * max = setPrices[i];
 * }
 * }
 * System.out.println(max)
 * }
 * }
 */