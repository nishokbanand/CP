import java.util.Scanner;

public class searchinrotatedarr {
    static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int index = left;
        left = 0;
        right = arr.length - 1;
        if (target >= arr[index] && target <= arr[right]) {
            left = index;
        } else {
            right = index;
        }
        return binarysearch(arr, left, right, target);
    }

    static int binarysearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                return binarysearch(arr, left, right - 1, target);
            }
            if (target > arr[mid]) {
                return binarysearch(arr, left + 1, right, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(search(arr, target));
        sc.close();
    }
}
