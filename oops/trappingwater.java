import java.util.Scanner;

public class trappingwater {
    static long trapwater(int[] arr) {
        Long[] left = new Long[arr.length];
        Long[] right = new Long[arr.length];
        left[0] = (long) arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[arr.length - 1] = (long) arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        int water = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            long res = Math.min(left[i - 1], right[i + 1]);
            if (res > arr[i]) {
                water += res - arr[i];
            }
        }
        return water;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(trapwater(arr));
    }
}
