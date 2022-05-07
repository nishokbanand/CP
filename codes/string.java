import java.util.Scanner;

public class string{
    static String commonprefix(String s1, String s2){
        String res ="";
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if(s1.charAt(i) != s2.charAt(i)){
                break;
            }
            res+= s1.charAt(i);
        }
       return res; 
    }
    static String appendanddelete(String s1 , String s2 , int op){
        String prefix = commonprefix(s1,s2);
        int lenofprefix = prefix.length();
        int add = s1.length() - lenofprefix;
        int del = s2.length() - lenofprefix;
        int m = add+del;
        int e = op - m;
        if(e<0) return "No";
        if(e < 2*lenofprefix && e%2 !=0)return "No";
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int op = sc.nextInt();
        System.out.println( appendanddelete(s1,s2,op));

    }
}