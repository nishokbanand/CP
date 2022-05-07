import java.util.Scanner;
import java.util.Stack;

public class pattern_132 {
    static boolean checkpattern(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1, max = Integer.MIN_VALUE; i >= 0; i--) {
            if (arr[i] < max) {
                return true;
            }
            while (!st.isEmpty() && st.peek() <= arr[i])
                max = st.pop();
            st.push(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { -1, 3, 2, 0 };
        System.out.println(checkpattern(arr));
    }
}
