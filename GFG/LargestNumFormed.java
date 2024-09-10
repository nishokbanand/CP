import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LargestNumFormed {
    static String largestnum(String[] arr, int size) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        String rs = "";
        for (String str : arr) {
            rs += str;
        }
        return rs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        System.out.println(largestnum(arr, size));
        sc.close();
    }
}
