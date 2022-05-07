
import java.util.Scanner;

public class smallest_string {
    static String smallestval(int n, int k) {
        char[] ch = new char[n];
        for (int i = 0; i < n; i++) {
            ch[i] = 'a';
            k--;
        }
        int currchar = 0;
        while (k > 0 && n > 0) {
            currchar = Math.min(k, 25);
            ch[--n] += (char) currchar;
            k -= currchar;
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(smallestval(n, k));
        sc.close();
    }
}
