import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * permutation
 */
public class permutation {
    static String swap(String str, int left, int right) {
        StringBuilder sb = new StringBuilder(str);
        char ch = sb.charAt(left);
        sb.setCharAt(left, sb.charAt(right));
        sb.setCharAt(right, ch);
        return sb.toString();
    }

    static List<String> permu(String str, int left, int right, List<String> res) {
        if (left == right) {
            res.add(str);
            return res;
        }
        for (int i = left; i <= right; i++) {
            str = swap(str, left, i);
            permu(str, left + 1, right, res);
            str = swap(str, i, left);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        List<String> res = new ArrayList<>();
        res = permu(str, 0, str.length() - 1, res);
        Iterator<String> it = res.iterator();
        boolean flag = false;
        while (it.hasNext()) {
            String ch = it.next();
            if (str2.contains(ch + "")) {
                flag = true;
            }
        }
        System.out.println(flag);
        sc.close();
    }
}