import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascaltri {
    static List<List<Integer>> pascaltriangle(int num) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(pre.get(j) + pre.get(j - 1));
                }
            }
            pre = row;
            result.add(row);
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(pascaltriangle(num));
        sc.close();
    }
}
