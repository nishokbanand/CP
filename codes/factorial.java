import java.math.BigInteger;
import java.util.*;
public class factorial{
    static BigInteger factorial(int n){
        BigInteger res = new BigInteger(String.valueOf(n));
        return fact(res,n);
    }
    static BigInteger fact(BigInteger num,int n){
        BigInteger fact = new BigInteger(String.valueOf(num));
        for (int i = 2; i < n; i++) {
            fact = fact.multiply(new BigInteger(String.valueOf(i)));
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}