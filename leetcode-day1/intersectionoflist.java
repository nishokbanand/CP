class ListNode {
    int val;
    ListNode next;

    ListNode() {
    };

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class intersectionoflist {
    static ListNode changesign(ListNode list) {
        ListNode dummy = list;
        while (dummy != null) {
            dummy.val *= -1;
            dummy = dummy.next;
        }
        return dummy;
    }

    static int intersection(ListNode list1, ListNode list2) {
        int result = 0;
        changesign(list1);
        while (list2 != null) {
            if (list2.val < 0) {
                result = list2.val;
                break;
            }
            list2 = list2.next;
        }
        changesign(list1);
        return result * -1;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(4);
        ListNode list01 = new ListNode(1);
        ListNode list03 = new ListNode(8);
        list1.next = list01;
        list01.next = list03;

        ListNode list2 = new ListNode(6);
        list2.next = list01;
        list01.next = list03;
        System.out.println(intersection(list1, list2));
    }
}
