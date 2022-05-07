import java.util.Arrays;
import java.util.Scanner;

/**
 * helpfulmaths
 */
public class helpfulmaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] s = input.split("\\+");
        Arrays.sort(s);
        String a = "";
        for (int i = 0; i < s.length; i++) {
            if (i != s.length - 1)
                a += s[i] + "+";
            else
                a += s[i];
        }
        System.out.println(a);
        sc.close();
    }
}