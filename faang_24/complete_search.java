import java.util.Deque;
import java.util.LinkedList;

public class complete_search {
    static int n;
    static int[] a;
    static Deque<Integer> list;

    static void findsubsets(int k) {
        if (k == n) {
            for (int num : list) {
                System.out.print(a[num] + " ");
            }
            System.out.println();
        } else {
            findsubsets(k + 1);
            list.addLast(k);
            findsubsets(k + 1);
            list.removeLast();
        }
    }

    static Deque<String> d;
    static boolean[] chosen;

    static void findpermutations(String str, int index, String curr) {
        int n = str.length();
        if (list.size() == n) {
            for (int num : list) {
                System.out.print(str.charAt(num));
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (chosen[i] == true)
                    continue;
                chosen[i] = true;
                list.addLast(i);
                findpermutations(str, index + 1, curr);
                chosen[i] = false;
                list.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        a = new int[] { 0, 1, 2 };
        n = a.length;
        list = new LinkedList<>();
        // findsubsets(0);
        String str = "abc";
        chosen = new boolean[str.length()];
        findpermutations(str, 0, "");

    }
}
