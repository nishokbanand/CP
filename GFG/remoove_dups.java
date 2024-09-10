import java.util.LinkedHashSet;
import java.util.Scanner;

public class remoove_dups {
    static String rm_dups(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray())
            set.add(ch);
        str = "";
        for (Character character : set) {
            str += character;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(rm_dups(a));
        sc.close();
    }
}
