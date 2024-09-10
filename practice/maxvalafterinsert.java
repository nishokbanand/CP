import java.util.Scanner;

public class maxvalafterinsert {
    static int index;

    static String findmaxnum(String a, int x) {
        index = -1;
        StringBuilder sb = new StringBuilder(a);
        int right = a.length() - 1;
        boolean post = true;
        if (a.charAt(0) == '-')
            post = false;
        findright_pos(a, right, x, post);
        if (index == -1)
            index = right + 1;
        sb.insert(index, x);
        return sb.toString();
    }

    static void findright_pos(String sb, int right, int num_x, boolean flag) {
        if (flag) {
            while (right >= 0) {
                int curr = Integer.parseInt(sb.charAt(right) + "");
                if (curr < num_x)
                    index = right;
                right--;
            }
        } else {
            while (right > 0) {
                int curr = Integer.parseInt(sb.charAt(right) + "");
                if (curr > num_x) {
                    index = right;
                }
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int x = sc.nextInt();
        System.out.println(findmaxnum(a, x));
        sc.close();
    }
}
