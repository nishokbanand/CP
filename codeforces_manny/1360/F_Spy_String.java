
import java.util.Scanner;

public class F_Spy_String {

    static boolean check(char[] temp, String[] arr, int str_size) {
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < str_size; j++) {
                if (arr[i].charAt(j) != temp[j]) {
                    cnt++;
                }
            }
            if (cnt >= 2)
                return false;
        }
        return true;
    }

    static String Spy_String(String[] arr, int str_size) {
        // abac
        // bbad
        // abad
        String ans = arr[0];
        for (int i = 0; i < str_size; i++) {
            for (int j = 0; j < 26; j++) {
                char[] temp = ans.toCharArray();
                temp[i] = (char) ('a' + j);
                if (check(temp, arr, str_size)) {
                    return String.valueOf(temp);
                }
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int str_size = sc.nextInt();
            String[] arr = new String[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.next();
            }
            System.out.println(Spy_String(arr, str_size));
        }
        sc.close();
    }
}
