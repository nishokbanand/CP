import java.util.HashMap;
import java.util.Scanner;

/**
 * longestsubstrwithoutrepeat
 */
public class longestsubstrwithoutrepeat {
    static int longest(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int len = 0;
        while (end < str.length()) {
            char ch = str.charAt(end);
            if (map.containsKey(ch) && start <= map.get(ch)) {
                start = map.get(ch) + 1;
                map.put(ch, end);
            } else {
                map.put(ch, end);
            }
            len = Math.max(len, (end - start) + 1);
            end++;
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(longest(str));
        sc.close();
    }
}