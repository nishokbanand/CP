import java.util.Scanner;

public class iq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size + 1];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int even = 0, odd = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even = i;
                count++;
            } else {
                count--;
                odd = i;
            }
        }
        System.out.println(count > 0 ? odd : even);
        sc.close();
    }
}
