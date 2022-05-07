import java.util.Scanner;

public class funwithevensubarrays {
    static int fun(int[] arr) {
        int n = arr.length - 1;
        int ans = 0;
        int i = n - 1;
        while (i >= 0) {
            if (arr[i] != arr[n]) {
                ans++;
                i = n - (n - i) * 2;
            } else
                i--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int[] arr = new int[sc.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(fun(arr));
        }
        sc.close();
    }
}
