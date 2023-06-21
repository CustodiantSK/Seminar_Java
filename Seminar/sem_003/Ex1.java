package Seminar.sem_003;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Item> itemList = createList(n);
        System.out.println("itemList = " + itemList);
        String searchName = scanner.nextLine();
        Integer sumVolume = 0;
        List<String> countryList = new ArrayList<>();
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().equals(searchName)) {
                sumVolume += itemList.get(i).getVolume();
                countryList.add(itemList.get(i).getCounty());
            }

        }
        System.out.println("countryList" + countryList);
        System.out.println("sumVolume" + sumVolume);
    }

    private static ArrayList<Item> createList(int n) {
        ArrayList<Item> itemList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            Item item1 = new Item("WHO1", "Russia1", random.nextInt(100));
            Item item2 = new Item("WHO2", "Russia2", random.nextInt(100));
            Item item3 = new Item("WHO3", "Russia3", random.nextInt(100));
            Item item4 = new Item("WHO4", "Russia4", random.nextInt(100));
            Item item5 = new Item("WHO5", "Russia5", random.nextInt(100));
            itemList.add(item1);
            itemList.add(item2);
            itemList.add(item3);
            itemList.add(item4);
            itemList.add(item5);
        }
        return itemList;
    }
}
