import java.util.HashMap;
import java.util.Scanner;

public class subpal{
    static String reverse(String s){
        String str= "";
        for (int i = s.length()-1; i >=0; i--) {
            str+=s.charAt(i);
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String str1 = s.substring(i,j);
                String str2 = reverse(str1);
                if(str1.equals(str2) && res.length()<str1.length() && str1.length()>1){
                    res = str1;
                }
            }
        }
        System.out.println(res);
    }
}
