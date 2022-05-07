import java.util.Scanner;

public class reverse {
    public static int reverse(int x) {
        int carry = 1;
        if(x < 0 ){
            carry = -1;
        }
        x = Math.abs(x);
        int temp = x;
        int res = 0;
        int temp2 = x;
        while(temp!=0){
            temp2 = temp%10;
            res = res*10 + temp2;
            temp = temp/10;
        }
        System.out.println((int)Math.pow(2,31)+1);
        // if(res > pow1 || res < pow2){
        //     return 0;
        // }
        return carry*res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        System.out.println(reverse(l));
    }
}
