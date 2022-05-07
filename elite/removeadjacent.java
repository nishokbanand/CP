import java.util.Scanner;
import java.util.Stack;

public class removeadjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else
                st.pop();
        }
        if (st.isEmpty()) {
            System.out.println(-1);
        } else {
            while (!st.isEmpty()) {
                System.out.print(st.pop() + " ");
            }
        }
    }
}
