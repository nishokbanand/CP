import java.util.Scanner;

public class minimum_platforms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] dept = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < dept.length; i++) {
            dept[i] = sc.nextInt();
        }
        // System.out.println(minimum_platforms_needed(arr, dept));
        sc.close();
    }
}
