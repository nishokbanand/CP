import java.util.Scanner;

/**
 * C_Where_s_the_Bishop
 */
public class C_Where_s_the_Bishop {
    static int[] where_s_the_Bishop(String[] arr) {
        char[][] char_array = new char[8][8];
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            for (int j = 0; j < str.length(); j++) {
                char_array[i][j] = str.charAt(j);
            }
        }
        int[] res = new int[2];
        for (int i = 0; i < char_array.length - 2; i++) {
            for (int j = 0; j < char_array.length - 2; j++) {
                if (char_array[i][j] == '#' && char_array[i][j + 2] == '#' && char_array[i + 2][j] == '#'
                        && char_array[i + 2][j + 2] == '#') {
                    res[0] = i + 2;
                    res[1] = j + 2;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            String[] arr = new String[8];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.next();
            }
            int[] res = where_s_the_Bishop(arr);
            for (int i : res) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}