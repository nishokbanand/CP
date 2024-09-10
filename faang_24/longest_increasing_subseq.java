import java.util.Scanner;

public class longest_increasing_subseq {
    static int findlongest(int[] arr, int[] length) {
        for (int i = 0; i < arr.length; i++) {
            length[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i])
                    length[i] = Math.max(length[i], length[j] + 1);
            }
        }
        int max = 0;
        for (int num : length)
            max = Math.max(max, num);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 10, 22, 9, 33, 21, 50, 41, 2 };
        int[] length = new int[arr.length];
        System.out.println(findlongest(arr, length));
        sc.close();
    }
}
