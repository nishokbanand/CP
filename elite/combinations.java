import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        ArrayList<String> val = new ArrayList<>();
        for (int i = 1; i < (1 << s.length()); i++) {
            StringBuilder sb = new StringBuilder();
            for (int bmi = 0; bmi < s.length(); bmi++) {
                if ((i & (1 << bmi)) != 0) {
                    sb.append(s.charAt(bmi));
                }
            }
            val.add(sb.toString());
        }
        for (String string : val) {
            System.out.println(string);
        }
    }
}
