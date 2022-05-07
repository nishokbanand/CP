import java.util.ArrayList;
import java.util.Scanner;

/**
 * comb
 */
public class comb {
    static String swap(String str, int start, int end) {
        StringBuilder sb = new StringBuilder(str);
        Character c = sb.charAt(start);
        sb.setCharAt(start, sb.charAt(end));
        sb.setCharAt(end, c);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> ar = new ArrayList<>();
        for (int i = 1; i < (1 << str.length()); i++) {
            StringBuilder sb = new StringBuilder();
            for (int bmi = 0; bmi < str.length(); bmi++) {
                if ((i & (1 << bmi)) != 0) {
                    sb.append(str.charAt(bmi));
                }
            }
            ar.add(sb.toString());
        }
        for (String string : ar) {
            System.out.println(string);
        }
    }
}