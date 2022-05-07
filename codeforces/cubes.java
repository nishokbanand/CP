import java.util.Scanner;

public class cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int v = 0;
        for (int i = 1; i <= n; i++) {
            v = v + i;
            n = n - v;
            if (n >= 0) {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
