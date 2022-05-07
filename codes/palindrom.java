import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = 0;
        int temp = a;
        int temp2;
        while(temp!=0){
            temp2 = temp%10;
            res = res*10+temp2;
            temp = temp/10;
        }
        if(a == res){
            System.out.println(res);
        }
        // a = Math.abso
    }
}
