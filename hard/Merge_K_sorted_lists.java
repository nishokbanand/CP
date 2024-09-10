import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Merge_K_sorted_lists {
    static class qComparator implements Comparator<List<Integer>> {
        @Override
        public int compare(List<Integer> o1, List<Integer> o2) {
            return o1.get(1) - o2.get(1);
        }

    }

    public static void main(String[] args) {
        PriorityQueue<List<Integer>> q = new PriorityQueue<>(new qComparator());
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(6);
        l1.next = l2;
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(2);
        l3.next = l4;
        ListNode[] lists = new ListNode[] { l1, l2 };
        List<Integer> temp;
        for (int i = 0; i < lists.length; i++) {
            temp = new ArrayList<>();
            ListNode t = lists[i];
            if (t != null) {
                temp.add(t.val);
                temp.add(i);
                q.add(temp);
            }
        }
        System.out.println(q);
    }
}
