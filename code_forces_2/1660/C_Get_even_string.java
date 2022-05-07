import java.util.Scanner;

public class C_Get_even_string {
    static int calc_even_string(String str) {
        int[] ans = new int[str.length() + 1];
        int[] last = new int[26];
        for (int i = 1; i <= str.length(); i++) {
            if (last[str.charAt(i - 1) - 'a'] != 0) {
                ans[i] = 2 + ans[last[str.charAt(i - 1) - 'a'] - 1];
            }
            ans[i] = Math.max(ans[i], ans[i - 1]);
            last[str.charAt(i - 1) - 'a'] = i;
        }
        return str.length() - ans[str.length()];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        while (testcase-- > 0) {
            String str = sc.nextLine();
            System.out.println(calc_even_string(str));
        }
        sc.close();
    }
}
