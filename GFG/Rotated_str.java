import java.util.Scanner;

public class Rotated_str {
    static boolean Rotated_st(String str_a, String str_b) {
        if (str_a.length() != str_b.length())
            return false;
        if (str_a.length() < 2)
            return true;
        String clock_wise = str_a.substring(str_b.length() - 2) + str_a.substring(0, str_b.length() - 2);
        String anti_clc_wise = str_a.substring(2) + str_a.substring(0, 2);
        return str_b.compareTo(clock_wise) == 0 || str_b.compareTo(anti_clc_wise) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str_a = sc.nextLine();
        String str_b = sc.nextLine();
        System.out.println(Rotated_st(str_a, str_b));
        sc.close();
    }
}
