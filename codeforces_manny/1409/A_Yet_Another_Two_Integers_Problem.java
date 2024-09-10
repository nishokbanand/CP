import java.util.Scanner;

/**
 * A_Yet_Another_Two_Integers_Problem
 */
public class A_Yet_Another_Two_Integers_Problem {
    static int Yet_Another_Two_Integers_Problem(int a, int b) {
        double diff = (double) Math.abs(a - b) / (double) 10;
        return (int) Math.ceil(diff);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(Yet_Another_Two_Integers_Problem(a, b));
        }
        sc.close();
    }
}