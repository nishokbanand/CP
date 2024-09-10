import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class C_infinite_replacement {
    static long calc_str(String str1, String str2) {
        char[] ch = str2.toCharArray();
        Arrays.sort(ch);
        if (ch[0] == 'a' && str2.length() > 1)
            return -1;
        else if (ch[0] == 'a')
            return 1;
        else {
            long ans = 1;
            for (long i = 1; i <= str1.length(); i++) {
                ans *= 2;
            }
            return ans;
        }
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
