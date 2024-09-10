import java.util.Scanner;

public class Rotate_list {
    static void printlist(Node node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    static Node rotatelist(Node head, int k) {
        Node curr_node = head;
        while (curr_node.next != null)
            curr_node = curr_node.next;
        curr_node.next = head;
        curr_node = head;
        for (int i = 0; i < k - 1; i++) {
            curr_node = curr_node.next;
        }
        head = curr_node.next;
        curr_node.next = null;
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node tail = head;
        for (int i = 0; i < n - 1; i++) {
            tail.next = new Node(sc.nextInt());
            tail = tail.next;
        }
        int k = sc.nextInt();
        Node new_head = rotatelist(head, k);
        printlist(new_head);
        sc.close();

    }
}

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}