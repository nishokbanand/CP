import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C_infinite_replacement {
    static int calc_str(String str1, String str2) {
        if (str2.length() == 1 && str2.contains("a"))
            return 1;
        if (str2.contains("a")) {
            return -1;
        }
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < str1.length(); i++) {
            StringBuilder sb = new StringBuilder(str1);
            sb.deleteCharAt(i);
            sb.insert(i, str2);
            set.add(sb.toString());
        }
        System.out.println(set);
        return set.size() + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();
            System.out.println(calc_str(str1, str2));
        }
        sc.close();
    }
}
