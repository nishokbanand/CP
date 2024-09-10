import java.util.Scanner;

public class findnextpermutation {
    static void findnextpermu(int[] arr) {
        // 1 2 3
        int index1 = arr.length - 2;
        while (index1 >= 0 && arr[index1] >= arr[index1 + 1])
            index1--;
        int index2 = arr.length - 1;
        if (index1 >= 0) {
            while (index2 < arr.length && arr[index1] >= arr[index2])
                index2--;
            swap(arr, index1, index2);
        }
        reverse(arr, index1 + 1);
        for (int num : arr)
            System.out.println(num);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int left) {
        int right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 1, 4, 5, 3 };
        findnextpermu(arr);
        sc.close();
    }
}
