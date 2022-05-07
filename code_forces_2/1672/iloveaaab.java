import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * iloveaaab
 */
public class iloveaaab {
    static String tolove(String str) {
        int sum = 0;
        if (str.charAt(str.length() - 1) != 'B')
            return "No";
        for (char ch : str.toCharArray()) {
            if (ch == 'A')
                sum++;
            if (ch == 'B')
                sum--;
            if (sum < 0)
                return "No";
        }
        if (sum < 0)
            return "No";
        else
            return "yes";
    }

    static String tolove(String str) {
        if (str.length() == 1)
            return "NO";
        if (str.charAt(str.length() - 1) != 'B' || str.charAt(0) == 'B')
            return "NO";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == 'B' && str.charAt(i) == 'B') {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        List<String> res = new ArrayList<>();
        while (testcase-- > 0) {
            String str = sc.nextLine();
            res.add(tolove(str));
        }
        Iterator<String> it = res.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        sc.close();
    }
}