import java.util.Scanner;

public class search2dmatrix {
    static boolean search2d(int[][] mat, int target) {
        for (int i = 0; i < mat.length; i++) {
            if (target <= mat[i][mat[0].length - 1] && target >= mat[i][0]) {
                return binarysearch(mat[i], 0, mat[0].length - 1, target);
            }
        }
        return false;
    }

    static boolean binarysearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = (left) + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (target > arr[mid]) {
                return binarysearch(arr, mid + 1, right, target);
            }
            if (target < arr[mid]) {
                return binarysearch(arr, left, mid - 1, target);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        System.out.println(search2d(mat, target));
        sc.close();
    }
}
