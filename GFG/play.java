import java.util.Scanner;

public class play {
    static int findmajorityele(int[] arr) {
        int count = 0;
        int ele = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                ele = arr[i];
            }
            if (ele == arr[i])
                count++;
            else
                count--;
        }
        return ele;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findmajorityele(arr));
    }
}
