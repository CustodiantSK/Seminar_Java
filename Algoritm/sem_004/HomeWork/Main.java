package HomeWork;

public class Main {

    public static void main(String[] args) {
        RedBlackTree<Integer> tree = new RedBlackTree<>();

        tree.add(6);
        tree.add(2);
        tree.add(7);
        tree.add(1);
        tree.add(4);
        tree.add(3);
        tree.add(5);
        tree.add(9);
        tree.add(0);
        tree.add(-1);
        tree.add(-10);
        tree.add(-5);

        System.out.println("\n");
        tree.print();

        System.out.println("\n");
        tree.inorder();
        System.out.println("\n");

    }
}
