import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class sortArraybyparity {
    static int[] byparity(int[] arr) {
        List<Integer> res = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0)
                even.add(num);
        }
        res.addAll(even);
        for (int num : arr) {
            if (num % 2 != 0)
                res.add(num);
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 1, 2, 4 };
        int[] res = byparity(arr);
        for (int num : res) {
            System.out.println(num);
        }
    }
}
