import java.util.Scanner;

public class continuoussubarr {
    static int[] findcontinuous(int[] arr, int sumtobfound) {
        int left = 0, right = 0;
        int[] ans = new int[2];
        int sum = 0;
        while (right < arr.length) {
            System.out.println("sum " + sum);
            sum += arr[right];
            while (sum > sumtobfound) {
                sum -= arr[left];
                left++;
            }
            if (sum == sumtobfound) {
                ans[0] = left;
                ans[1] = right;
                return ans;
            }
            right++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sumtobfound = sc.nextInt();
        int[] result = findcontinuous(arr, sumtobfound);
        for (int i : result) {
            System.out.println(i + 1);
        }
        sc.close();
    }
}