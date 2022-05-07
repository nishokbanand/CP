import java.util.Scanner;

/**
 * isasubsequence
 */
public class isasubsequence {
    static String s1, s2;

    public static boolean checkseq(int i, int j) {
        if (i == -1) {
            return true;
        }
        if (j == -1) {
            return false;
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            return checkseq(i - 1, j);
        }
        return checkseq(i, j - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.println(checkseq((int) s1.length() - 1, (int) s2.length() - 1));
    }
}