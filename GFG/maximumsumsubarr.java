import java.util.Scanner;

public class maximumsumsubarr {
    static int findmaximumsubarr(int[] arr) {
        /*
         * 1 2 3 -2 5
         * 
         */
        int max = Integer.MIN_VALUE;
        int localmax = 0;
        for (int i = 0; i < arr.length; i++) {
            localmax += arr[i];
            if (localmax > max)
                max = localmax;
            if (localmax < 0)
                localmax = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findmaximumsubarr(arr));
    }
}
