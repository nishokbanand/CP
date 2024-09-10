import java.util.HashSet;
import java.util.Scanner;

/**
 * A_Spell_Check
 */
public class A_Spell_Check {
    static String func(String str) {
        String cmp = "Timur";
        if (str.length() != cmp.length())
            return "NO";
        HashSet<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return "NO";
            }
            if (!cmp.contains(ch + ""))
                return "NO";
            set.add(ch);
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            System.out.println(func(str));
        }
    }
}