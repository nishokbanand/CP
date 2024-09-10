public class LinkedList {
    Node head;

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static LinkedList insert(LinkedList list, int val) {
        Node new_node = new Node(val);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last_node = list.head;
            while (last_node.next != null) {
                last_node = last_node.next;
            }
            last_node.next = new_node;
        }
        return list;
    }

    static void printlist(LinkedList list) {
        Node curr_node = list.head;
        while (curr_node != null) {
            System.out.println(curr_node.val);
            curr_node = curr_node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1 = insert(list1, 5);
        list1 = insert(list1, 6);
        printlist(list1);
    }
}