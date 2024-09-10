import java.util.Scanner;

public class B_Ternary_Sequence {
    static int Ternary_Sequence(int[] a, int[] b) {
        int res = 0;
        int min = Math.min(a[0], b[2]);
        a[0] -= min;
        b[2] -= min;
        min = Math.min(a[1], b[0]);
        a[1] -= min;
        b[0] -= min;
        min = Math.min(a[2], b[1]);
        a[2] -= min;
        b[1] -= min;
        res = 2 * min;
        res -= 2 * Math.min(b[2], a[1]);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int[] a = new int[3];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[3];
            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
            }
            System.out.println(Ternary_Sequence(a, b));
        }
    }
}