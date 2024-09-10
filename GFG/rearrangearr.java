import java.util.Arrays;
import java.util.Scanner;

public class rearrangearr {
    static void rearrange(int[] arr, int size) {
        /*
         * 1 2 3 4 5 6
         */
        int max_index = size - 1;
        int min_index = 0;
        int maxele = arr[size - 1] + 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[max_index] % maxele) * maxele;
                max_index--;
            } else {
                arr[i] += (arr[min_index] % maxele) * maxele;
                min_index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / maxele;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        rearrange(arr, size);
        sc.close();
    }
}
