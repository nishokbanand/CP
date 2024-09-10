import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class A_Digit_Game {
    static int playmatches(int size, int[] arr) {
        ArrayList<Integer> even_index_list = new ArrayList<>();
        ArrayList<Integer> odd_index_list = new ArrayList<>();
        for (int i = 1; i < arr.length; i += 2)
            even_index_list.add(arr[i]);
        for (int i = 0; i < arr.length; i += 2)
            odd_index_list.add(arr[i]);
        if (size % 2 == 0) {
            Iterator<Integer> it = odd_index_list.iterator();
            while (it.hasNext()) {
                if (it.next() % 2 == 0)
                    return 2;
                return 1;
            }
        } else {
            Iterator<Integer> it = even_index_list.iterator();
            while (it.hasNext()) {
                if (it.next() % 2 == 1)
                    return 1;
                return 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            String str = sc.next();
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(str.charAt(i) + "");
            }
            System.out.println(playmatches(size, arr));
        }
        sc.close();
    }
}