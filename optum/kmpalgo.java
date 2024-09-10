import java.util.Scanner;

/**
 * kmpalgo
 */
public class kmpalgo {
    static void findpattern(String str, String pattern) {
        int m = pattern.length();
        int n = str.length();
        int[] lps = new int[m];
        preprocess(pattern, lps, m);
        int i = 0;
        int j = 0;
        while ((n - i) >= (m - j)) {
            if (pattern.charAt(j) == str.charAt(i)) {
                i++;
                j++;
            }
            if (j == m) {
                System.out.println("pattern found at" + (i - j));
                j = lps[j - 1];
            } else if (i < n && pattern.charAt(j) != str.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

    }

    static void preprocess(String pattern, int[] lps, int m) {
        lps[0] = 0;
        int i = 1;
        int j = 0;
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                lps[i] = j + 1;
                j++;
                i++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String pattern = sc.nextLine();
        findpattern(str, pattern);
    }
}