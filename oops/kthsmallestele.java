import java.util.Scanner;

public class kthsmallestele {
    static int kthsmallestel(int[] arr, int size, int k) {
        int[] temp = new int[(int) Math.pow(10, 5)];
        for (int num : arr) {
            temp[num]++;
        }
        int counter = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                counter++;
            }
            if (counter == k)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(kthsmallestel(arr, size, k));
    }
}
