import java.util.*;
public class gcd {
    public static ArrayList gcd(int a,int b){
        ArrayList<Integer> n = new ArrayList<Integer>();
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                n.add(i);
            }
        }
        return n;
    }
    public static int method2(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return b;
    }
    public static  int fibo(int n){
        if(n<2) return n;
        return (fibo(n-1)+fibo(n-2));
    }
    public static int euclid(int a,int b){
        if(a==0){
            return b;
        }
        return euclid(b%a, a);
    }
    public static void main(String[]args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        a = sc.nextInt();
        b=sc.nextInt();
        /*ArrayList<Integer>c =gcd(a,b);
        Iterator<Integer> d = c.iterator();
        while(d.hasNext()){
            System.out.print(d.next()+" ");
        }*/
        //int k =euclid(a, b);
        int k = method2(a,b);
       
            System.out.print(fibo(5000)+" ");
        
    }
}
