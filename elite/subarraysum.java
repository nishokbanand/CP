import java.util.Scanner;

public class subarraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int required_sum = sc.nextInt();
        int li = 0, ri = 0, curr_sum = arr[0];
        for (li = 0, ri = 0; li < arr.length && ri < arr.length;) {
            if (required_sum == curr_sum) {
                System.out.println("yes");
                return;
            } else {
                if (curr_sum < required_sum) {
                    ri++;
                    if (ri < arr.length) {
                        curr_sum += arr[ri];
                    }
                } else {
                    if (li < arr.length) {
                        curr_sum -= arr[li];
                    }
                    li++;
                }
            }
        }
        System.out.println("no");

    }
}
