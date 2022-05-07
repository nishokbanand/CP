import java.util.Arrays;
import java.util.Scanner;

public class sumofalloddlengtharr {
    static int sumof(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j += 2) {
                int[] subarr = Arrays.copyOfRange(arr, i, j);
                for (int k = 0; k < subarr.length; k++) {
                    System.out.print("sub " + subarr[k]);
                    res += subarr[k];
                }
                System.out.println();
            }
        }
        return res;
        // int res = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j <= arr.length; j += 2) {
        // int[] subarr = Arrays.copyOfRange(arr, i, j);
        // for (int k = 0; k < subarr.length; k++) {
        // res += subarr[k];
        // }
        // }
        // }
        // return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sumof(arr));
        sc.close();
    }
}
