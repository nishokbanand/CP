import java.util.Scanner;

public class movezeroes {
    static void movearr(int[] arr) {
        int lastnonzero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[lastnonzero++] = arr[i];
            }
        }
        for (int i = lastnonzero; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        movearr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
