import java.util.Arrays;
import java.util.Scanner;

//1790
public class oneswapmakeitequal {
    static boolean canwemakeitequal(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int cunt = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (ch1 != ch2) {
                cunt++;
            }
            if (cunt > 2) {
                return false;
            }
            freq1[ch1 - 'a']++;
            freq2[ch2 - 'a']++;
        }
        return Arrays.equals(freq1, freq2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(canwemakeitequal(s1, s2));
        sc.close();
    }
}
