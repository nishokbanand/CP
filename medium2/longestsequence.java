import java.util.HashSet;
import java.util.Scanner;

public class longestsequence {
    static int longestseq(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int item : arr) {
            set.add(item);
        }
        int longeststreak = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                System.out.println("num " + num);
                int currnum = num;
                int currstreak = 1;
                while (set.contains(currnum + 1)) {
                    currnum += 1;
                    currstreak += 1;
                }
                longeststreak = Math.max(currstreak, longeststreak);
            }
        }
        return longeststreak;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestseq(arr));
        sc.close();
    }
}