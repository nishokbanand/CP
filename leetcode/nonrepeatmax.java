import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class nonrepeatmax {
    static List<Integer> nonrepeat(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), i);
        }
        int max = 0;
        int prev = -1;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            max = Math.max(max, map.get(str.charAt(i)));
            if (max == i) {
                res.add(max - prev);
                prev = max;
            }
        }
        return res;
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (char ch : str.toCharArray()) {
        // map.put(ch, map.get(ch) == null ? 1 : map.get(ch) + 1);
        // }
        // HashSet<Character> res = new HashSet<>();
        // HashSet<Character> set = new HashSet<>();
        // StringBuilder sb = new StringBuilder();
        // List<Integer> realresult = new ArrayList<>();
        // int result = 0;
        // for (char ch : str.toCharArray()) {
        // set.add(ch);
        // sb.append(ch);
        // map.put(ch, map.get(ch) - 1);
        // for (char ch2 : set) {
        // if (map.get(ch2) == 0) {
        // res.add(ch2);
        // }
        // }
        // if (res.size() == set.size()) {
        // result++;
        // realresult.add(sb.length());
        // sb.delete(0, sb.length());

        // } else {
        // res.clear();
        // }
        // }
        // return realresult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(nonrepeat(str));
        sc.close();
    }
}
