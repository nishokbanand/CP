import java.util.Scanner;

/**
 * latinsquare
 */
public class latinsquare {

    public static void main(String[] args) {
        /**
         * 1 2 3
         * 3 1 2
         * 2 3 1
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = num + 1;
        for (int i = 1; i <= num; i++) {
            for (int j = k; j <= num; j++) {
                System.out.print(j + " ");
            }
            for (int l = 1; l < k; l++) {
                System.out.print(l + " ");
            }
            k--;
            System.out.println();
        }
        sc.close();
    }
}