import java.util.Scanner;

/**
 * alphabeticount
 */
public class alphabeticount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] ascii = new int[128];
        for (int i = 0; i < s.length(); i++) {
            ascii[s.charAt(i)]++;
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (ascii[ch] > 0) {
                System.out.print(ch + "" + ascii[ch]);
            }
        }
    }
}