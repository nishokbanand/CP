import java.util.Stack;

/**
 * nearest_smallest_ele
 */
public class nearest_smallest_ele {
    static void findnearestsmallest(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty())
                System.out.println(-1);
            else
                System.out.println(st.peek());
            st.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 5, 2, 7, 6, 9, 1 };
        findnearestsmallest(arr);
    }
}