import java.util.Scanner;

public class buyandsellstock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int maxprofit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            } else {
                int profit = arr[i] - min;
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }
        System.out.println(maxprofit);
    }
}
