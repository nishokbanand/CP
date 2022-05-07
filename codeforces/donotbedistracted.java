import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * donotbedistracted
 */
public class donotbedistracted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        while (testcase != 0) {
            String str = sc.next();
            str = str.toLowerCase();
            boolean[] visited = new boolean[26];
            boolean flag = true;
            Arrays.fill(visited, false);
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (visited[ch - 'a'] && ch != str.charAt(i - 1)) {
                    flag = false;
                } else
                    visited[ch - 'a'] = true;
            }
            if (flag) {
                arr.add("yes");
            } else {
                arr.add("no");
            }
            testcase--;
        }
        Iterator it = arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        sc.close();
    }
}