import java.util.Scanner;

public class sudoku {
    static int R = 9, C = 9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rflags = new int[9];
        int[] cflags = new int[9];
        int[] smflags = new int[9];
        for (int i = 0; i < smflags.length; i++) {
            rflags[i] = cflags[i] = smflags[i] = 1;
        }
        int digit;
        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                digit = sc.nextInt();
                rflags[row] |= (1 << digit);
                cflags[col] |= (1 << digit);
                smflags[(row / 3) * 3 + (col / 3)] |= (1 << digit);
            }
        }
        int val = (1 << 10) - 1;
        for (int i = 0; i < 9; i++) {
            if (rflags[i] != val || cflags[i] != val || smflags[i] != val) {
                System.out.println("invalid");
                return;
            }
        }
        System.out.println("Valid");
    }
}
