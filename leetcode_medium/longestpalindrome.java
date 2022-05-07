import java.util.Scanner;

public class longestpalindrome {
    static String substr(String str) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            int len1 = len(str, i, i);
            int len2 = len(str, i, i + 1);
            int len = Math.max(len1, len2);
            System.out.println("iter " + i);
            System.out.println("len1 " + len1);
            if (len > end - start) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }
        return str.substring(start, end + 1);
    }

    static int len(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
            System.out.println("left " + left);
        }
        return right - left + 1 - 1;
    }

    public static void main(String[] args) {
        System.out.println((int) 3 / 2);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(substr(str));
        sc.close();
    }
}