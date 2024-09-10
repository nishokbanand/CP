import java.util.Scanner;

public class B_make_it_increasing {
    static int makeitincrease(int[] arr) {
        boolean final_ = false;
        int res = 0;
        while (true) {
            boolean flag = true;
            int i = 1;
            while (i < arr.length) {
                if (arr[i] == 0 && arr[i - 1] == 0) {
                    final_ = true;
                    break;
                }
                if (arr[i - 1] >= arr[i]) {
                    res++;
                    arr[i - 1] /= 2;
                    flag = false;
                    break;
                }
                i++;
            }
            if (flag)
                break;
        }
        if (!final_)
            return res;
        else
            return -1;
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
            System.out.println(makeitincrease(arr));
        }
        sc.close();
    }
}
