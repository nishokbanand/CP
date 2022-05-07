import java.util.Scanner;

public class searchinrotatedII {
    static boolean search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return true;
            // left is sorted
            if (arr[mid] > arr[right]) {
                if (target < arr[mid] && target >= arr[left]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            // right is sorted
            else if (arr[mid] < arr[right]) {
                if (target > arr[left] && target > arr[mid]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            } else {
                left++;
            }
        }

        return false;
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
