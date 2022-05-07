import java.util.Scanner;

/**
 * nearestval
 */
public class nearestval {
    static int x, closest;

    static String swap(String str, int l, int r) {
        StringBuilder sb = new StringBuilder(str);
        char temp = str.charAt(l);
        sb.setCharAt(l, sb.charAt(r));
        sb.setCharAt(r, temp);
        return sb.toString();
    }

    static int absolute(int a, int b) {
        return a > b ? a - b : b - a;
    }

    static void permute(String str, int l, int r) {
        if (l == r) {
            int curr = Integer.parseInt(str);
            if (absolute(curr, x) < absolute(x, closest)) {
                closest = curr;
            }
        }
        for (int i = l; i <= r; i++) {
            str = swap(str, l, i);
            permute(str, l + 1, r);
            str = swap(str, l, i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        x = sc.nextInt();
        closest = Integer.parseInt(str);
        permute(str, 0, str.length() - 1);
        System.out.println(closest);
    }
}