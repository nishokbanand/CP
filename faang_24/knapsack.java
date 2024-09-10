import java.util.Scanner;

public class knapsack {
    static void findsums(int[] arr) {
        boolean[] possible = new boolean[13];
        possible[0] = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 12; j >= 0; j--) {
                if (possible[j]) {
                    possible[j + arr[i]] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 1, 3, 3, 5 };
        findsums(arr);
        sc.close();
    }

}
