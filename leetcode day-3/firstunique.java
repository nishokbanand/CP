import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class firstunique {
    static int firstun(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.get(ch) == null ? 1 : map.get(ch) + 1);
        }
        Character ch = '*';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ch = entry.getKey();
                break;
            }
        }
        return s.indexOf(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(firstun(s));
        sc.close();
    }
}
