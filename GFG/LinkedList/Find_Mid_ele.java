
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

public class Find_Mid_ele {
    static void printlist(Node node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    static int find_mid_ele(Node node) {
        Node slow = node;
        Node fast = node;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    static void findele(Node head) {
        HashSet<Node> set = new HashSet<>();
        set.add(head);
        if (set.contains(head)) {

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
        System.out.println(find_mid_ele(head));
        sc.close();
    }
}