import java.util.Scanner;

/**
 * A_food_for_animals
 */
public class A_food_for_animals {
    static String foodallocate(int[] arr) {
        if (arr[3] > arr[0]) {
            if (arr[2] == 0)
                return "No";
            int temp = arr[3] - (arr[2] + arr[0]);
            if (temp > 0)
                return "No";
            arr[2] = arr[2] - Math.abs(arr[3] - arr[0]);
            if (arr[2] < 0)
                return "No";
        }
        if (arr[4] > arr[1]) {
            if (arr[2] == 0)
                return "No";
            int temp = arr[4] - (arr[1] + arr[2]);
            if (temp > 0)
                return "No";
            arr[2] = arr[2] - Math.abs(arr[4] - arr[1]);
            if (arr[2] < 0)
                return "No";
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int[] arr = new int[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(foodallocate(arr));
        }
        sc.close();
    }
}