import java.util.Scanner;

public class noofonebits {
    // brian kernighan algorithm
    static int countnoof1s(int n) {
        int res = 0;
        while (n > 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countnoof1s(n));
        sc.close();
    }
}
