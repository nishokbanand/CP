import java.util.Scanner;

public class verticalzigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            int val = row, dir = -1, down = (n - row) * 2 + 1, up = (row - 1) * 2 + 1;
            for (int col = 1; col <= n; col++) {
                System.out.print(val + " ");
                if (dir == -1) {
                    val += down;
                } else {
                    val += up;
                }
                dir *= -1;
            }
            System.out.println();
        }
    }
}
