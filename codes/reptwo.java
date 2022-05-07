import java.util.Scanner;
public class reptwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a.length());
        for(int i =0;i<a.length()/2;i++){
            if(a.charAt(i) == a.charAt(a.length()-i-1)){
                System.out.println("palindrome");
            }
        }
        sc.close();
    }
}
