import java.util.Scanner;

/**
 * A_Two_Elevators
 */
public class A_Two_Elevators {
    static int findele(int[] arr) {
        int first_one = arr[0] - 1;
        int scnd_one = arr[2];
        if (first_one == scnd_one)
            return 3;
        if (first_one > scnd_one)
            return 2;
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int[] arr = new int[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(findele(arr));
        }
        sc.close();
    }
}