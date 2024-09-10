import java.util.HashSet;
import java.util.Scanner;

public class maximumlength {
    static int max;

    static int findmaxlen(String[] strs) {
        max = Integer.MIN_VALUE;
        dfs(0, strs, "");
        return max;
    }

    static void dfs(int start, String[] strs, String curr) {
        if (!isUnique(curr))
            return;
        max = Math.max(curr.length(), max);
        for (int i = start; i < strs.length; i++) {
            String temp = strs[i];
            dfs(i + 1, strs, curr + temp);
        }
    }

    static boolean isUnique(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (set.contains(ch))
                return false;
            set.add(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[sc.nextInt()];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.next();
        }
        System.out.println(findmaxlen(input));
        sc.close();
    }
}
