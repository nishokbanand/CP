import java.util.Scanner;

public class buyandsellonmultdays {
    static int buyandsell(int[] arr, int start, int end) {
        if (end >= start) {
            return 0;
        }
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr[j] > arr[i]) {
                    profit = (arr[j] - arr[i]) + buyandsell(arr, start, i - 1) + buyandsell(arr, j + 1, end);
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(buyandsell(arr, 0, arr.length - 1));
    }
}
