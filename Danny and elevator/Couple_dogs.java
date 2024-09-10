import java.util.Scanner;

/**
 * Couple_dogs
 */
public class Couple_dogs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = 0;
        for (int i = 1; i < str.length(); i++) {
            if ((str.charAt(i) == 'm' && str.charAt(i - 1) == 'f')
                    || (str.charAt(i) == 'f' && str.charAt(i - 1) == 'm')) {
                ans++;
                i += 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}