import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class genparanthesis {
    static List<String> gen(int n) {
        List<String> res = new ArrayList<>();
        generator(res, "", 0, 0, n);
        return res;
    }

    static void generator(List<String> res, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            res.add(str);
        }
        if (open < max)
            generator(res, str + "(", open + 1, close, max);
        if (close < open)
            generator(res, str + ")", open, close + 1, max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(gen(n));
        sc.close();
    }
}
