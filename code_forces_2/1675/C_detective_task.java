import java.util.Scanner;

/**
 * C_detective_task
 */
public class C_detective_task {
    static int findthief(String str) {
        int k1 = -1, k2 = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1')
                k1 = i + 1;
            if (str.charAt(i) == '0') {
                k2 = i + 1;
                break;
            }
        }
        if (str.length() == 1)
            return 1;
        if (k1 == -1 && k2 == -1)
            return str.length();
        else if (k2 == -1)
            return str.length() - k1 + 1;
        else if (k1 == -1)
            return k2;
        else
            return k2 - k1 + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            String str = sc.next();
            System.out.println(findthief(str));
        }
        sc.close();
    }
}