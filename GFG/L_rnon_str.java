import java.util.HashMap;
import java.util.Scanner;

public class L_rnon_str {
    static int find_non_repeat(String str) {
        int start = 0, res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < str.length(); end++) {
            if (map.containsKey(str.charAt(end))) {
                start = Math.max(start, map.get(str.charAt(end)));
            }
            map.put(str.charAt(end), end);
            res = Math.max(res, end - start);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(find_non_repeat(str));
        sc.close();
    }
}
