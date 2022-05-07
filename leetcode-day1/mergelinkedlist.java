
public class mergelinkedlist {

    public static void mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyhead1 = list1;
        ListNode dummyhead2 = list2;
        ListNode res = new ListNode(0);
        ListNode temp = res;
        while (dummyhead1 != null && dummyhead2 != null) {
            if (dummyhead1.val <= dummyhead2.val) {
                temp.next = dummyhead1;
                dummyhead1 = dummyhead1.next;
            } else if (dummyhead1.val > dummyhead2.val) {
                temp.next = dummyhead2;
                dummyhead2 = dummyhead2.next;
            }
            temp = temp.next;
        }
        while (dummyhead1 != null) {
            temp.next = dummyhead1;
            dummyhead1 = dummyhead1.next;
            temp = temp.next;

        }
        while (dummyhead2 != null) {
            temp.next = dummyhead2;
            dummyhead2 = dummyhead2.next;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list01 = new ListNode(2);
        ListNode list03 = new ListNode(4);
        list1.next = list01;
        list01.next = list03;

        ListNode list2 = new ListNode(1);
        ListNode list02 = new ListNode(3);
        ListNode list04 = new ListNode(4);
        list2.next = list02;
        list02.next = list04;

        mergeTwoLists(list1, list2);
    }
}
