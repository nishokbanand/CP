import java.util.Scanner;

public class gangleader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= R; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x]--;
            arr[y]++;
        }
        for (int i = 1; i <= N; i++) {
            if (arr[i] == N - 1) {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}
