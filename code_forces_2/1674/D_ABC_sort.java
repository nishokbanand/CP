import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D_ABC_sort {
    static boolean sorter(int[] arr2) {
        int[] arr = arr2;
        if (arr2.length == 1) {
            int val = 0;
            String str = arr2[0] + "";
            arr = new int[str.length()];
            for (char ch : str.toCharArray()) {
                arr[val++] = Integer.parseInt(ch + "");
            }
        }
        int[] b = new int[arr.length];
        int left = 0;
        int right = b.length - 1;
        b[left++] = arr[arr.length - 1];
        b[right--] = arr[arr.length - 2];

        for (int i = 0; i < arr.length - 2; i++) {
            if (i % 2 != 0) {
                b[right--] = arr[i];

            } else {
                b[left++] = arr[i];
            }
        }
        int[] c = new int[arr.length];
        List<Integer> list = new ArrayList<>();
        Arrays.stream(b).forEach(num -> list.add(num));
        for (int i = 0; i < arr.length; i++) {
            int mid = list.size() / 2;
            c[i] = list.get(mid);
            list.remove(mid);
            if (list.size() == 2) {
                c[i + 1] = list.get(0);
                c[i + 2] = list.get(1);
                break;
            }
        }
        for (int i = 1; i < c.length; i++) {
            if (c[i] < c[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(sorter(arr));
        }
    }
}
