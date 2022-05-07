import java.util.Scanner;

public class luckynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        String str = Long.toString(a);
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '4' || str.charAt(i) == '7') {
                res++;
            }
        }
        if ((res == 4 || res == 7) && res != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
