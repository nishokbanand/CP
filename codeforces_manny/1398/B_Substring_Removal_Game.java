import java.util.Arrays;
import java.util.Scanner;

/**
 * B_Substring_Removal_Game
 */
public class B_Substring_Removal_Game {
    static int Substring_Removal_Game(String str) {
        char[] arr = str.toCharArray();
        int cnt = 0;
        int[] size = new int[arr.length];
        Arrays.fill(size, -1);
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                cnt++;
                if (i == arr.length - 1) {
                    size[counter++] = cnt;
                }
            } else if (arr[i] == '0') {
                size[counter++] = cnt;
                cnt = 0;
            }
        }
        Arrays.sort(size);
        int res = 0;
        for (int i = size.length - 1; i >= 0; i -= 2) {
            if (size[i] == -1)
                break;
            res += size[i];

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            String str = sc.next();
            System.out.println(Substring_Removal_Game(str));
        }
        sc.close();
    }
}