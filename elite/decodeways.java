import java.util.Scanner;

public class decodeways {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ways = 1, prevway = 1;
        if (str.charAt(str.length() - 1) == '0') {
            ways = 0;
        }
        for (int i = str.length() - 2; i >= 0; i--) {
            int backup = prevway;
            prevway = ways;
            if (str.charAt(i) == '0') {
                ways = 0;
                continue;
            }
            int twoDigitvalue = Integer.parseInt(str.substring(i, i + 2));
            if (twoDigitvalue <= 26) {
                ways += backup;
            }
        }
        System.out.println(ways);
    }
}
