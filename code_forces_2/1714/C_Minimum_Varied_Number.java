import java.util.Scanner;

/**
 * C_Minimum_Varied_Number
 */
public class C_Minimum_Varied_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int s = sc.nextInt();
            String result = "";
            for (int i = 9; i > 0; i--) {
                if (s >= i) {
                    result = i + result;
                    s -= i;
                }
            }
            System.out.println(result);
        }
    }
}