import java.util.Scanner;

/**
 * searchwordinmat
 */
public class searchwordinmat {
    static int r, c, found = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        r = scan.nextInt();
        c = scan.nextInt();
        char[][] matrix = new char[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scan.next().charAt(0);
            }
        }
        scan.nextLine();
        String word = scan.nextLine();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == word.charAt(0))
                    dfs(matrix, i, j, word, 0);
                if (found == 0) {
                    System.out.println("no");
                    return;
                }
            }
        }

        System.out.println("yes");
    }

    private static void dfs(char[][] matrix, int row, int col, String word, int index) {
        if (row >= 0 && row < r && col >= 0 && col < c) {
            if (index >= word.length()) {
                found = 1;
                return;
            }

            if (matrix[row][col] != word.charAt(index))
                return;

            char copy = matrix[row][col];
            matrix[row][col] = '*';
            dfs(matrix, row, col + 1, word, index + 1);
            dfs(matrix, row, col - 1, word, index + 1);
            dfs(matrix, row + 1, col, word, index + 1);
            dfs(matrix, row - 1, col, word, index + 1);

            matrix[row][col] = copy;
        }
    }

}
