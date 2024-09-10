import java.util.Scanner;

public class longest_palindrome {
    static String res = "";
    static int res_length = 0;

    static String longest_palindrom(String str) {
        for (int i = 0; i < str.length(); i++) {
            longest_index(str, i, i);
            longest_index(str, i, i + 1);
        }
        return res;
    }

    static void longest_index(String str, int start, int end) {
        while (start >= 0 && end <= str.length() - 1 && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;
        }
        if (end - start + 1 >= res_length) {
            res = str.substring(start + 1, end);
            res_length = end - start + 1;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(longest_palindrom(str));
        sc.close();
    }
}
