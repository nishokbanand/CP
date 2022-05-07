import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class construct {
    static String repeatlimit(String str, int repeatlimit) {
        int[] freq = new int[26];
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (Character ch : str.toCharArray()) {
            int index = ch - 'a';
            System.out.println(index);
            set.add(index);
            freq[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        while (set.size() > 0) {
            int i = set.pollFirst();
            while (true) {
                int val = Math.min(repeatlimit, freq[i]);
                while (freq[i] > 0 && val-- > 0) {
                    char ch = ((char) (i + 'a'));
                    sb.append(ch);
                    freq[i]--;
                }
                if (freq[i] > 0) {
                    if (set.size() == 0)
                        return sb.toString();
                    int k = set.first();
                    char ch = (char) ('a' + k);
                    sb.append(ch);
                    if (freq[k--] == 0)
                        set.pollFirst();
                } else {
                    break;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int repeatlimit = sc.nextInt();
        System.out.println(repeatlimit(str, repeatlimit));
        sc.close();

    }
}
