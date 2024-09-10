import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Rev_k_node_pairs {
    static Node reverseKnodes(Node node, int k) {
        Node curr = node;
        Node prev = null;
        Node next = null;
        int count = 0;
        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null) {
            node.next = reverseKnodes(next, k);
        }
        List<Integer> list = new ArrayList<>();
        Collections.sort(list);
        return prev;

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
        int k = sc.nextInt();
        Node new_head = reverseKnodes(head, k);
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