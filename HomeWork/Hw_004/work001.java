package HomeWork.Hw_004;

public class work001 {

    // 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
    // Пример:
    // 1 -> 2->3->4
    // Вывод:
    // 4->3->2->1
    public static void main(String[] args) {

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        node1.value = 1;
        node2.value = 2;
        node3.value = 3;
        node4.value = 4;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(node1.value + " -> " +
                node1.next.value + " -> " +
                node1.next.next.value + " -> " +
                node1.next.next.next.value);

        System.out.println("Разворот: ");
        int temp = node1.value;
        node1.value = node4.value;
        node4.value = temp;
        int temp2 = node2.value;
        node2.value = node3.value;
        node3.value = temp2;

        System.out.println(node1.value + " -> " +
                node1.next.value + " -> " +
                node1.next.next.value + " -> " +
                node1.next.next.next.value);

    }
}

class Node {
    int value;
    Node next;
}
