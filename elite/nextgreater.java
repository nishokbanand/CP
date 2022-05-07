import java.util.Scanner;
import java.util.Stack;

public class nextgreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int nextgreater = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                st.push(arr[i]);
            } else if (st.peek() > arr[i]) {
                nextgreater = st.peek();
                st.push(arr[i]);
                arr[i] = nextgreater;
            } else {
                while (!st.isEmpty() && st.peek() <= arr[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    st.push(arr[i]);
                } else {
                    nextgreater = st.peek();
                    st.push(arr[i]);
                    arr[i] = nextgreater;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
