import java.util.Scanner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Permutations {
    static List<String> permu(String str) {
        List<String> res = new ArrayList<>();
        findpermu(str, 0, str.length() - 1, res);
        res.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (int i = 1; i < res.size(); i++) {
            if (res.get(i).equals(res.get(i - 1))) {
                res.remove(i);
            }
        }
        return res;
    }

    static void findpermu(String str, int l, int r, List<String> res) {
        if (l == r) {
            res.add(str);
        }
        for (int i = l; i <= r; i++) {
            str = swap(str, l, i);
            findpermu(str, l + 1, r, res);
            str = swap(str, l, i);
        }
    }

    static String swap(String str, int l, int r) {
        StringBuilder sb = new StringBuilder(str);
        char ch = sb.charAt(l);
        sb.setCharAt(l, sb.charAt(r));
        sb.setCharAt(r, ch);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(permu(str));
        sc.close();
    }
}
