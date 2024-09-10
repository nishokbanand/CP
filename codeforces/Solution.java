import java.util.Scanner;

public class Solution {
    static int sol(int integer) {
        String str = integer + "";
        int size = str.length();
        int counter = 0;
        int[] arr = new int[size];
        while (integer > 0) {
            int temp = integer % 10;
            arr[counter++] = temp;
            integer /= 10;
        }
        if (size == 1)
            return integer;
        if (size == 2)
            return arr[1];
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.min(max, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int integer = sc.nextInt();
            System.out.println(sol(integer));
        }
    }
}