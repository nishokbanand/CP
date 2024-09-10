
import java.util.HashSet;
import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Merge_2_sorted_List {
    static void printlist(Node node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    static Node reverse(Node a) {
        Node prev = null;
        Node next = null;
        Node curr = a;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static Node mergeNode(Node a, Node b) {
        a = reverse(a);
        b = reverse(b);
        Node head = null;
        Node temp = null;
        while (a != null && b != null) {
            if (a.val >= b.val) {
                temp = a.next;
                a.next = head;
                head = a;
                a = temp;
            } else {
                temp = b.next;
                b.next = head;
                head = b;
                b = temp;
            }
        }
        while (a != null) {
            temp = a.next;
            a.next = head;
            head = a;
            a = temp;
        }
        while (b != null) {
            temp = b.next;
            b.next = head;
            head = b;
            b = temp;
        }
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
        int m = sc.nextInt();
        Node head2 = new Node(sc.nextInt());
        Node tail2 = head2;
        for (int i = 0; i < m - 1; i++) {
            tail2.next = new Node(sc.nextInt());
            tail2 = tail2.next;
        }
        Node result = mergetwolist(head, head2);
        printlist(result);
        sc.close();
    }
}