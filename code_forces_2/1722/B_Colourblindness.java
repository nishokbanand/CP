import java.util.Scanner;

/**
 * B_Colourblindness
 */
public class B_Colourblindness {
    static String color(String row1, String row2, int n) {
        for (int i = 0; i < n; i++) {
            if (row1.charAt(i) == 'R' && row2.charAt(i) != 'R' || (row2.charAt(i) == 'R' && row1.charAt(i) != 'R'))
                return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            String row1 = sc.next();
            String row2 = sc.next();
            System.out.println(color(row1, row2, n));
        }
    }
}