import java.util.Scanner;

/**
 * E_Add_Modulo_10
 */
public class E_Add_Modulo_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int[] arr = new int[sc.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

        }
        sc.close();
    }
}