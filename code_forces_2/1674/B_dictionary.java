import java.util.Scanner;

public class B_dictionary {
    static int berland_index(String str) {
        int[] arr = new int[26];
        arr[0] = 0;
        arr[1] = 25;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 25;
        }
        int part_1 = arr[str.charAt(0) - 'a'] + 1;
        int part_2 = 0;
        if (str.charAt(0) - 'a' < str.charAt(1) - 'a') {
            part_2 = str.charAt(1) - 'a' - 1;
        } else
            part_2 = str.charAt(1) - 'a';
        return part_1 + part_2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            String str = sc.next();
            System.out.println(berland_index(str));
        }
        sc.close();
    }
}
