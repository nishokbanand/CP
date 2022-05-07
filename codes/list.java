public class list {
    Listnode head;
    static class Listnode{
            int value;
            Listnode next;
            Listnode(int value){
                this.value = value;
                next = null;
            }
    }
    static list insertnode(list list , int data){
        Listnode a = new Listnode(data);
        a.next = null;
        if(list.head ==  null){
            list.head = a;
        }
        else{
            Listnode last = list.head;
            while(last.next != null ){
                last = last.next;
            }
            last.next = a;
        }
        return list;
    }
    static void printlist(Listnode a){
        while(a !=null){
            System.out.println(a.value);
            a = a.next;
        }
    }
}
