import java.util.Scanner;

public class Rev_list {
    static Node reverselist(Node node) {
        Node curr = node;
        Node prev = null;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    static void printlist(Node node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
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
        Node new_head = reverselist(head);
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