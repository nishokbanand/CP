import java.util.Scanner;

public class minjumpstoreachend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int jumps = 1, maxReachIndex = arr[0], steps = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i == N - 1) {
                break;
            }
            if (i + arr[i] > maxReachIndex) {
                maxReachIndex = i + arr[i];
            }
            steps--;
            if (steps == 0) {
                jumps++;
                steps = maxReachIndex - i;
            }
        }
        System.out.println(jumps);
    }
}
