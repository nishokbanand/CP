import java.util.Scanner;

/**
 * B_Missing_Bigram
 */
public class B_Missing_Bigram {
    public static String bigram(String[] arr) {
        String res = arr[0].charAt(0) + "";
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].charAt(0) != arr[i - 1].charAt(1)) {
                flag = true;
                res += arr[i - 1].charAt(1);
            }
            res += arr[i].charAt(0);
        }
        res += arr[arr.length - 1].charAt(1);
        if (!flag) {
            res += 'a';
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int length_of_word = sc.nextInt();
            String[] arr = new String[length_of_word - 2];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.next();
            }
            System.out.println(bigram(arr));
        }
        sc.close();
    }
}