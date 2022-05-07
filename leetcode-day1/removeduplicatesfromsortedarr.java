import java.util.Scanner;

public class removeduplicatesfromsortedarr {
    static int removedups(int[] arr) {
        int left = 0;
        int right = 1;
        int count = 0;
        while (right < arr.length - 1) {
            while (arr[left] == arr[right] && right < arr.length - 1) {
                right++;
            }
            left++;
            arr[left] = arr[right];
            count++;
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = (char) '_' - '0';
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        removedups(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
