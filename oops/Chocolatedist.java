import java.util.Arrays;
import java.util.Scanner;

public class Chocolatedist {
    static int chocolatedist(int[] arr, int M) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i + M - 1 < arr.length; i++) {
            min = Math.min(min, arr[i + M - 1] - arr[i]);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        System.out.println(chocolatedist(arr, M));
        sc.close();
    }
}
