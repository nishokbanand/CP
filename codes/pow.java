import java.util.Scanner;

public class pow {
    static double power(double x , int a){
        double result = 1;
        long aa =a ;
        if(a<0)aa=-1 * aa;
        while(aa>0){
            if(aa%2 == 1){
                result = result * x;
                aa=aa-1;
            }
            else{
                x = x*x;
                aa = aa/2;
            }
        }
        if( a<0)result = (double)1/(double)result;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int x = sc.nextInt();
        System.out.println(power(a,x));
    }
}
