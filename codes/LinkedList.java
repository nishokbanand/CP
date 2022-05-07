public class LinkedList{
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next =  null;
        }
    }
    public static LinkedList insert(LinkedList list , int data){
        Node new_node = new Node(data);
        new_node.next = null;
        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node current = list.head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = new_node;
        }
        return list;
    }
    public LinkedList deletekey(LinkedList list , int key){
        Node current = list.head;
        Node prev = null;
        if(current!=null && current.data==key){
            list.head = current.next;
            return list;
        }
        while(current!=null && current.data!=key){
            prev = current;
            current = current.next;
        }
        if(current!=null && current.data==key){
            prev.next = current.next;
            System.out.println(key+" is deleted");
            return list;
        }
        return list;
    }
    public LinkedList addkeyafter(LinkedList list ,int data, int key){
        Node current = list.head;
        Node temp = null;
        Node new_node = new Node(data);
        while(current!=null &&  current.data!=key){
            current = current.next;
        }
        if(current.data==key){
            temp = current.next;
            current.next = new_node;
            new_node.next=temp;
        }
        return list;
    }
    public static void printList(Node list){
        Node current = list;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public static Node removebeforenthnode(LinkedList list , int n){
        Node dummy_head = list.head;
        Node prev = null;
        int size = 0;
        while(dummy_head!=null){
            size++;
            dummy_head = dummy_head.next;
        }
        System.out.println(size);
        dummy_head = list.head;
        if(size-n==0){
            list.head = dummy_head.next;
        }
        else{
        for(int i = 1 ;i <= size-n ; i++){
            prev = dummy_head;
            dummy_head = dummy_head.next;
        }
        prev.next = dummy_head.next;
        }
        return dummy_head;
    }
    public static Node mergetwoList(Node l1,Node l2){
        Node l3 = new Node(0);
        Node dummy_head1 = l1;
        Node dummy_head2 = l2;
        while(dummy_head1!=null && dummy_head2!=null){
            if(dummy_head1.data<=dummy_head2.data){
                l3.next= dummy_head1;
                dummy_head1 = dummy_head1.next;
            }
            else{
                l3.next = dummy_head2;
                dummy_head2 = dummy_head2.next;
            }
            l3= l3.next;
        }
        while(dummy_head2!=null){
            l3.next = dummy_head2;
            l3 = l3.next;
            dummy_head2 = dummy_head2.next;
        }
        while(dummy_head1!=null){
            l3.next = dummy_head1;
            l3 = l3.next;
            dummy_head1 = dummy_head1.next;
        }
        return l3;
    }
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.insert(list1,1);
        list1.insert(list1,2);
        list1.insert(list1,3);
        // printList(list);
        // list.deletekey(list,5);
        // // printList(list);
        // list.addkeyafter(list,100,6);
        // printList(list);
        list1.insert(list1,4);
        list1.insert(list1,5);
        list2.insert(list2,1);
        list2.insert(list2,2);
        list2.insert(list2,3);
        list2.insert(list2,4);
        Node l3 = mergetwoList(list1.head,list2.head);
        printList(list1.head);
        printList(list2.head);
        printList(l3);
    }
}