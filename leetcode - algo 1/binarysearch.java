import java.util.Scanner;

/**
 * binarysearch
 */
public class binarysearch {
    static int binarysearc(int[] arr, int search) {
        int left = 0;
        int right = arr.length - 1;
        int i = searchutil(arr, left, right, search);
        return i;
    }

    static int searchutil(int[] arr, int left, int right, int search) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == search)
                return mid;
            if (arr[mid] < search) {
                return searchutil(arr, mid + 1, right, search);
            }
            if (arr[mid] > search) {
                return searchutil(arr, left, mid - 1, search);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        System.out.println(binarysearc(arr, search));
        sc.close();
    }
}