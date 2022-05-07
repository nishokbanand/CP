import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class permutationinstring {
    static boolean permutationinstr(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
            freq2[s2.charAt(i - s1.length()) - 'a'] -= 1;
            freq2[s2.charAt(i) - 'a'] += 1;
        }
        if (Arrays.equals(freq1, freq2))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(permutationinstr(s1, s2));
        sc.close();
    }
}
