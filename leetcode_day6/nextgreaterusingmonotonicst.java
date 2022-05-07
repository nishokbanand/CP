import java.util.Arrays;
import java.util.Stack;

public class nextgreaterusingmonotonicst {
    static int[] nextgreater(int[] arr) {
        int[] res = new int[arr.length];
        Arrays.fill(res, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 1, 2, 3, 4 };
        int[] res = nextgreater(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
