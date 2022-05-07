import java.util.Scanner;

public class brokencalc {
    static int broken(int startvalue, int target) {
        int res = 0;
        while (target > startvalue) {
            if (target % 2 != 0) {
                target += 1;
                res++;
                continue;
            }
            target /= 2;
            res++;
            if (target == startvalue)
                break;
        }
        res += startvalue - target;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startvalue = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(broken(startvalue, target));
        sc.close();
    }
}
