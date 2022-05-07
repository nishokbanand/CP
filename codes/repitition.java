import java.util.Scanner;
class repitition{
    public static boolean palindrome(String a){
        String rev = reverse(a);
        if(rev.equals(a)){
            return true;
        }
        return false;
    }
    public static String reverse(String  a){ 
       if(a.isEmpty()){
           return a;
       }
       return a.charAt(a.length()-1) + reverse(a.substring(0,a.length()-1));
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        boolean b = palindrome(a);
        if(b == true){
            System.out.println("palindrome");
        }
        sc.close();
    }
    
}