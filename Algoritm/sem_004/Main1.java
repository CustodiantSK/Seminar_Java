public class Main1 {
    public static void main(String[] args) {

        HashTable<String, Integer> table = new HashTable<>();
        table.add("A", 5);
        table.add("B", 2);
        table.add("C", 9);
        table.add("D", 1);
        table.add("F", 19);
        table.add("E", 55);
        table.print();
    }
}
