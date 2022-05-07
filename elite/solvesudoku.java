import java.util.Scanner;

class Slot {
    int r;
    int c;
}

public class solvesudoku {
    static int R = 9, C = 9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[R][C];
        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                mat[row][col] = sc.nextInt();
            }
        }
        if (solve(mat)) {
            for (int row = 0; row < R; row++) {
                for (int col = 0; col < C; col++) {
                    System.out.print(mat[row][col] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Not Solved");
        }
    }

    private static boolean solve(int[][] mat) {
        Slot slot = getFreeSlot(mat);
        if (slot == null) {
            return true;
        }
        for (int i = 1; i <= 9; i++) {
            if (canFillRow(mat, slot, i) && canFillCol(mat, slot, i) && canFillSubmatrix(mat, slot, i)) {
                mat[slot.r][slot.c] = i;
                if (solve(mat)) {
                    return true;
                }
                mat[slot.r][slot.c] = 0;
            }
        }
        return false;
    }

    private static Slot getFreeSlot(int[][] mat) {
        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                if (mat[row][col] == 0) {
                    Slot slot = new Slot();
                    slot.r = row;
                    slot.c = col;
                    return slot;
                }
            }
        }
        return null;
    }

    private static boolean canFillRow(int[][] mat, Slot slot, int digit) {
        for (int col = 0; col < C; col++) {
            if (mat[slot.r][col] == digit) {
                return false;
            }
        }
        return true;
    }

    private static boolean canFillCol(int[][] mat, Slot slot, int digit) {
        for (int row = 0; row < R; row++) {
            if (mat[row][slot.c] == digit) {
                return false;
            }
        }
        return true;
    }

    private static boolean canFillSubmatrix(int[][] mat, Slot slot, int digit) {
        int startRow = (slot.r / 3) * 3;
        int startCol = (slot.c / 3) * 3;
        for (int row = startRow; row <= startRow + 2; row++) {
            for (int col = startCol; col <= startCol + 2; col++) {
                if (mat[row][col] == digit) {
                    return false;
                }
            }
        }
        return true;
    }
}
