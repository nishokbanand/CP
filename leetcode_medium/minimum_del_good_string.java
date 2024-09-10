
/**
 * minimum_del_good_string
 */
import java.util.HashSet;
import java.util.Scanner;

public class minimum_del_good_string {
    static int minimum_deletions(String str) {
        int[] frq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            frq[str.charAt(i) - 'a']++;
        }
        HashSet<Integer> seen_freq = new HashSet<>();
        int del_count = 0;
        for (int i = 0; i < 26; i++) {
            while (frq[i] > 0 && seen_freq.contains(frq[i])) {
                frq[i]--;
                del_count++;
            }
            seen_freq.add(frq[i]);
        }
        return del_count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(minimum_deletions(str));
        sc.close();
    }
}