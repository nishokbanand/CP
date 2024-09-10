import java.util.Scanner;

/**
 * R_remove_adj_l
 */
public class R_remove_adj_l {
    static String remove(String str) {
        return util(str);
    }

    static String util(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                int temp = i;
                while (temp < sb.length() - 1 && sb.charAt(temp) == sb.charAt(temp + 1)) {
                    temp++;
                }
                sb.delete(i, temp + 1);
                i--;
            }
        }
        if (String.valueOf(sb).equals(str))
            return sb.toString();
        return util(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(remove(str));
        sc.close();
    }
}