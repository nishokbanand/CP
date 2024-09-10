import java.util.Scanner;

public class missingnumber {
    static int findmissingnum(int[] arr, int size) {
        int expectedsum = 0;
        for (int i = 1; i <= size; i++) {
            expectedsum += i;
        }
        int actualsum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualsum += arr[i];
        }
        return expectedsum - actualsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findmissingnum(arr, size));
    }
}
