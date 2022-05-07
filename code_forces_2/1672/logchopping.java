import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class logchopping {
    static String chop(int[] arr) {
        int res = 0;
        for (int num : arr) {
            res += num - 1;
        }
        return res % 2 == 0 ? "maomao90" : "errorgorn";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        List<String> res = new ArrayList<>();
        while (testcase-- > 0) {
            int[] arr = new int[sc.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            res.add(chop(arr));
        }
        for (String str : res) {
            System.out.println(str);
        }
    }
}