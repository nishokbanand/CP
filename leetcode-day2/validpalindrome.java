import java.util.Scanner;

public class validpalindrome {
    static boolean palindrome(String str) {
        StringBuilder sb1 = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                sb1.append(ch);
            }
        }
        String str1 = sb1.toString();
        str1 = str1.toLowerCase();
        StringBuilder sb2 = new StringBuilder(str1);
        String str2 = sb2.reverse().toString();
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(palindrome(str));
        sc.close();
    }
}
