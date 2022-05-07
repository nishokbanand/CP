import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class combinationsum2 {
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int candidate : candidates) {
            map.put(candidate, map.getOrDefault(candidate, 0) + 1);
        }
        List<int[]> counter = new ArrayList<>();
        map.forEach((key, value) -> {
            counter.add(new int[] { key, value });
        });
        backtrack(res, new LinkedList<>(), target, counter, 0);
        return res;
    }

    static void backtrack(List<List<Integer>> res, LinkedList<Integer> temp, int target,
            List<int[]> counter, int start) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            res.add(new ArrayList<>(temp));
        } else {
            for (int i = start; i < counter.size(); i++) {
                int[] arr = counter.get(i);
                int num = arr[0];
                int occ = arr[1];
                if (occ <= 0)
                    continue;
                temp.addLast(num);
                counter.set(i, new int[] { num, occ - 1 });
                backtrack(res, temp, target - num, counter, i);
                counter.set(i, new int[] { num, occ + 1 });
                temp.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] candidates = new int[sc.nextInt()];
        for (int i = 0; i < candidates.length; i++) {
            candidates[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(combinationSum2(candidates, target));
        sc.close();
    }
}