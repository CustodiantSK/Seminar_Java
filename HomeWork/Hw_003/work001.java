package HomeWork.Hw_003;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import HomeWork.Hw_003.dataFiles.ProductOne;

/* 1. Дан массив записей: наименование товара, цена, сорт. 
Найти наибольшую цену товаров 1го или 2-го сорта 
среди товаров, название которых содержит «высший».
 */
public class work001 {
    public static void main(String[] args) {

        String searchName = "высший";
        Integer maxPrice = 0;
        String maxPriceSortedNames = "";
        String maxPriceNames = "";

        List<ProductOne> listProducts = new ArrayList<>();
        ProductOne product1 = new ProductOne(
                "Перловка - Cредний",
                890,
                1);

        ProductOne product2 = new ProductOne(
                "Манка - Cредний",
                185,
                0);

        ProductOne product3 = new ProductOne(
                "Гречка - Высший",
                802,
                2);

        ProductOne product4 = new ProductOne(
                "Рис - Высший",
                1000,
                1);

        ProductOne product5 = new ProductOne(
                "Перловка - Низкий",
                50,
                0);

        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);
        listProducts.add(product5);

        for (ProductOne items : listProducts) {
            if (items.getProductName().toLowerCase().contains(searchName)
                    && (items.getProductSort() == 1 || items.getProductSort() == 2)) {
                if (maxPrice < items.getProductPrice()) {
                    maxPrice = items.getProductPrice();
                }
            }
        }
        for (ProductOne items : listProducts) {
            if (items.getProductName().toLowerCase().contains(searchName)
                    && (items.getProductSort() == 1 || items.getProductSort() == 2)) {

                maxPriceSortedNames += items.getProductName() + "\n";
                if (Objects.equals(items.getProductPrice(), maxPrice)) {
                    maxPriceNames = items.getProductName();
                }
            }
        }
        System.out.println("Товары первого и второго сорта, в названии которых есть слово 'высший': ");
        System.out.println(maxPriceSortedNames);
        System.out.println("Наибольшая цена: " + maxPrice + ", у продукта: " + maxPriceNames);
    }
}
