import java.util.Scanner;

public class peyta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();
        int res3 = a.compareTo(b);
        if (res3 > 0) {
            System.out.println(1);
        } else if (res3 < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
