import java.util.Scanner;
public class stocks {
    public static int lengthoflastw(String s){
        return s.length();
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthoflastw(s)); 
    }
    
}