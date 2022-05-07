import java.util.Scanner;

public class superpow {
    static void superpower(int a , int []b){
        // String str = "";
        // for (int i = 0; i < b.length; i++) {
        //     str= str+b[i];
        // }
        // if(a ==1)return 1;
        long aa = (long)a;
        long power = 0;
        for (int i = 0; i <= b.length-1; i++) {
            power = power*10+b[i];
        }
        // if(power ==0)return 1;
        System.out.println("power "+power);
        long result = 1;
        while(power>0){
            if(power%2==1){
                result = result * aa;
                power = power-1;
            }
            else{
                aa = aa*aa;
                power = power/2;
            }
        }
        System.out.println("result "+result);
        // long aa = (long)Integer.parseInt(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int []arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        superpower(x,arr); 
    }
}
