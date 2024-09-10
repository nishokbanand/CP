import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Ele {
    static long[] findnextgreaterele(long[] arr, int size) {
        Stack<Long> st = new Stack<>();
        long[] res = new long[size];
        for (int i = size - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < arr[i])
                st.pop();
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLong();
        }
        long[] res = findnextgreaterele(arr, size);
        for (long l : res) {
            System.out.println(l);
        }
        sc.close();
    }

}
