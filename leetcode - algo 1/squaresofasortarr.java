import java.util.Scanner;

public class squaresofasortarr {
    static int[] squaresofasort(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int left = 0;
        int right = arr.length - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(arr[left]) >= Math.abs(arr[right])) {
                res[i] = (int) Math.pow(arr[left], 2);
                left++;
            } else if (Math.abs(arr[left]) <= Math.abs(arr[right])) {
                res[i] = (int) Math.pow(arr[right], 2);
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = squaresofasort(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        sc.close();
    }
}