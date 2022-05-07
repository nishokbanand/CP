import java.util.HashMap;
import java.util.Scanner;
public class sum {
    static int[] findsum(int []nums, int target){
        int ans[] = new int[2];
        HashMap <Integer,Integer> a = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(a.containsKey(target - nums[i])){
                ans = new int[]{a.get(target-nums[i]),i};
                break;
            }
            else{
                a.put(target - nums[i], i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int [size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int []result = new int[2];
        result = findsum(arr,target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
