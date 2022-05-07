import java.util.Scanner;

public class findfirstandlast {

    static int[] res = new int[2];

    static void search(int[] arr, int target) {
        res[0] = searchfirst(arr, target, 0, arr.length - 1);
        res[1] = searchlast(arr, target, 0, arr.length - 1);
    }

    static int searchfirst(int[] arr, int target, int left, int right) {
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                index = mid;
                right = mid - 1;
            }
        }
        return index;
    }

    static int searchlast(int[] arr, int target, int left, int right) {
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                index = mid;
                left = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        search(arr, target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        sc.close();
    }
}
