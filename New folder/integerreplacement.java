import java.util.Scanner;

public class integerreplacement {
    public static int replacement(int n) {
        int noofoperations1 = 0;
        int noofoperations2 = 0;
        int a = n;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                noofoperations1++;
            } else {
                n = n + 1;
                noofoperations1++;
            }
        }
        while (a != 1) {
            if (a % 2 == 0) {
                a = a / 2;
                noofoperations2++;
            } else {
                a = a - 1;
                noofoperations2++;
            }
        }
        int noofoperations = Math.min(noofoperations1, noofoperations2);
        return noofoperations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(replacement(n));
    }
}
