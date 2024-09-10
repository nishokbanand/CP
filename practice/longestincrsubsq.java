import java.util.Arrays;
import java.util.Stack;

public class longestincrsubsq {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 10, 2, 1, 20 };
        int[] lis = new int[5];
        Arrays.fill(lis, 1);
        for (int i = 0; i < arr.length; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        Stack<Integer st = new Stack<>()x`
        int max = 0;
        for (int num : lis) {
            max = Math.max(max, num);
        }
        System.out.println(max);
    }
}
