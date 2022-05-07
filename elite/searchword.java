import java.util.Scanner;

public class searchword {
    static int R, C, found = 0;

    static void search(char[][] mat, int row, int col, String word, int index) {
        if (row >= 0 && row < R && col >= 0 && col < C) {
            if (index >= word.length()) {
                found = 1;
                return;
            }
            if (mat[row][col] != word.charAt(index)) {
                return;
            }
            char backup = mat[row][col];
            mat[row][col] = '-';
            search(mat, row, col - 1, word, index + 1);
            search(mat, row, col + 1, word, index + 1);
            search(mat, row + 1, col, word, index + 1);
            search(mat, row - 1, col, word, index + 1);
            mat[row][col] = backup;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        char[][] mat = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                mat[i][j] = sc.next().charAt(0);
            }
        }
        sc.nextLine();
        String word = sc.nextLine();
        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                if (mat[row][col] == word.charAt(0)) {
                    search(mat, row, col, word, 0);
                    if (found == 1) {
                        System.out.println("yes");
                        return;
                    }
                }
            }
        }
        System.out.println("no");
    }
}
