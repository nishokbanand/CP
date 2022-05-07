import java.util.ArrayList;
import java.util.List;

public class sumofallxorsub {
    public static void main(String[] args) {
        int[] nums = new int[] { 5, 1, 6 };
        List<List<Integer>> listoflist = new ArrayList<>();
        for (int i = 0; i < (1 << nums.length); i++) {
            List<Integer> list = new ArrayList<>();
            for (int bmi = 0; bmi < nums.length; bmi++) {
                if ((i & (1 << bmi)) != 0) {
                    list.add(nums[bmi]);
                }
            }
            listoflist.add(list);
        }
        listoflist.remove(0);
        int sum = 0;
        for (List<Integer> li : listoflist) {
            if (!li.contains(null)) {
                int localsum = li.get(0);
                System.out.println(localsum);
                for (int i = 1; i < li.size(); i++) {
                    localsum = localsum ^ li.get(i);
                }
                sum += localsum;
            }
        }
        System.out.println(sum);
    }
}
