import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * pascaltri2
 */
public class pascaltri2 {
    static List<Integer> pascal2(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long val = 1;
        for (int j = 0; j <= rowIndex; j++) {
            ans.add((int) val);
            val = (val * (rowIndex - j)) / (j + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println(pascal2(index));
        sc.close();
    }
}