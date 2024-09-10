import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class C_No_of_traingles {
    static int no_of_triangles(int[] arr) {
        Arrays.sort(arr);
        int cnt = 0;
        // generate all triplets
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = 0; j2 < arr.length; j2++) {
                    list.add(new int[] { arr[i], arr[j], arr[j2] });
                }
            }
        }
        arr = list.stream().mapToInt(Integer::intValue);
        for (int i = 0; i < arr.length - 2; i++) {

        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(no_of_triangles(arr));
    }
}
