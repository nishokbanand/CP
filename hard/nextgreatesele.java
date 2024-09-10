import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class nextgreatesele {
    static int findnextgreatesele(int[] arr) {
        Stack<Integer> st = new Stack<>();
        List<List<Integer>> list = new LinkedList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty())
                list.add(Arrays.asList(arr[i], -1));
            else
                list.add(Arrays.asList(arr[i], st.peek()));
            st.push(arr[i]);
        }
        System.out.println(list);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 1, 5, 4, 3 };
        System.out.println(findnextgreatesele(arr));
    }
}
