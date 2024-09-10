import java.util.Scanner;

/**
 * B_ICPC_Balloons
 */
public class B_ICPC_Balloons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int res = 0;
            boolean[] visited = new boolean[26];
            String str = sc.next();
            for (char ch : str.toCharArray()) {
                if (visited[ch - 'A'] == false) {
                    visited[ch - 'A'] = true;
                    res += 2;
                } else
                    res += 1;
            }
            System.out.println(res);
        }
        sc.close();
    }
}