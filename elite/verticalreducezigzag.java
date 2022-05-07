import java.util.Scanner;

public class verticalreducezigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            int val = row;
            int dir = -1;
            int down = (n - row) * 2 + 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(val + " ");
                if (dir == -1) {
                    val += down;
                } else {
                    val += (row - col) * 2;
                }
                dir *= -1;
            }
            System.out.println();
        }
    }
}
