import java.util.Scanner;

public class largestpossibleint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        int[] digits = new int[10];
        while (n != 0) {
            digits[(int) (n % 10)]++;
            n = n / 10;
        }
        int unit = -1;
        for (int i = 9; i >= 1; i -= 2) {
            if (digits[i] > 0) {
                unit = i;
                digits[i]--;
                break;
            }
        }
        if (unit == -1) {
            System.out.println("no");
            return;
        }
        int start = 1;
        for (int i = 1; i <= 9; i++) {
            if (digits[i] > 0) {
                digits[i]--;
                start = 0;
                break;
            }
        }
        for (int i = 9; i >= start; i--) {
            while (digits[i] > 0) {
                System.out.print(i);
                digits[i]--;
            }
        }
        System.out.print(unit);
    }
}