import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * mosstcommonword
 */
public class mosstcommonword {
    static String mostcommon(String para, String[] banned) {
        String[] words = para.replaceAll("[^a-zA-z0-9]", " ").toLowerCase().split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        HashSet<String> ban = new HashSet<>();
        for (String word : banned) {
            ban.add(word);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!ban.contains(word)) {
                map.put(word, map.get(word) == null ? 1 : map.get(word) + 1);
            }
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String para = sc.nextLine();
        String[] banned = new String[sc.nextInt()];
        for (int i = 0; i < banned.length; i++) {
            banned[i] = sc.next();
        }
        System.out.println(mostcommon(para, banned));
        sc.close();
    }
}