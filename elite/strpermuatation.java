import java.util.Scanner;

public class strpermuatation {
    static String swap(String str, int l, int r) {
        StringBuilder sb = new StringBuilder(str);
        char temp = str.charAt(l);
        sb.setCharAt(l, str.charAt(r));
        sb.setCharAt(r, temp);
        return sb.toString();

    }

    static void permu(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
            return;
        }
        for (int i = l; i <= r; i++) {
            str = swap(str, l, i);
            permu(str, l + 1, r);
            str = swap(str, l, i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        permu(str, 0, str.length() - 1);
    }
}
