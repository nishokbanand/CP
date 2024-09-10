import java.util.HashSet;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

/**
 * D_Double_Strings
 */
public class D_Double_Strings {
    static String double_str(String[] strs) {
        HashSet<String> set = new HashSet<>();
        for (String str : strs) {
            set.add(str);
        }
        char[] ans = new char[strs.length];
        for (int i = 0; i < strs.length; i++) {
            int size = strs[i].length();
            for (int j = 0; j < size; j++) {
                // System.out.println(str2);
                if (set.contains(strs[i].substring(j, size)) && set.contains(strs[i].substring(0, j))) {
                    ans[i] = '1';
                    break;
                } else {
                    ans[i] = '0';
                }
            }
        }
        String res = "";
        for (char ch : ans) {
            res += ch;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            String[] strs = new String[size];
            for (int i = 0; i < strs.length; i++) {
                strs[i] = sc.next();
            }
            System.out.println(double_str(strs));
        }
        sc.close();
    }
}