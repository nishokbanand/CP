import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        // System.out.println(list.toString());
        CustomLinkedList<String> list2 = new CustomLinkedList<>();
        list2.add("jhello");
        // System.out.println(list2.toString());
        Class1 cl = new Class1(1, 42);
        Class1[] arr = new Class1[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Class1(i, i * 100);
        }
        Arrays.sort(arr);
        System.out.println(Class1.toString(arr));

        Class1 cl2 = (Class1) (cl.clone());
        System.out.println(cl2.marks);
        cl.marks = 54;
        System.out.println(cl2.marks);
    }
}