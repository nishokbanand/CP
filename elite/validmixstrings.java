import java.util.Scanner;

public class validmixstrings {

    public static boolean isValidMix(String s1, String s2, String s3, int index1, int index2, int mixindex) {
        while (mixindex < s3.length()) {
            if (index1 < s1.length() && index2 < s2.length() && s1.charAt(index1) == s3.charAt(mixindex)
                    && s2.charAt(index2) == s3.charAt(mixindex)) {
                if (isValidMix(s1, s2, s3, index1 + 1, index2, mixindex + 1)) {
                    return true;
                } else {
                    return isValidMix(s1, s2, s3, index1, index2 + 1, mixindex + 1);
                }
            } else if (index1 < s1.length() && s1.charAt(index1) == s3.charAt(mixindex)) {
                index1++;
                mixindex++;
            }

            else if (index2 < s2.length() && s2.charAt(index2) == s3.charAt(mixindex)) {
                index2++;
                mixindex++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();
        int index1 = 0, index2 = 0, mixindex = 0;
        if (s3.length() == (s1.length() + s2.length())) {
            if (isValidMix(s1, s2, s3, index1, index2, mixindex)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }

    }
}
