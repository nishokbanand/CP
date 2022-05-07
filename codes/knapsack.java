import java.util.Scanner;
public class knapsack {
    public static int max(int a,int b){
        if(a > b)return a;
        return b;
    }
    public static int[][] knap(int w[],int v[],int capacity){
        int n= w.length;
        int [][]V = new int[n+1][capacity+1];
        for(int j=0;j<=capacity;j++)V[0][j] = 0;
        for(int i=1;i<=n;i++)V[i][0] = 0;
                for(int i = 1;i <= n;i++){
                    for(int j = 1;j <= capacity;j++){
                        if(j > w[i-1])V[i][j] = max(V[i-1][j],v[i-1] + V[i-1][j-w[i-1]]);
                        else{
                            V[i][j] = V[i-1][j];
                        }
                    }
                } 
        return V;
    }
    public static void main(String[]args){
        int capacity,size;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        size = sc.nextInt();
        int[] w = new int[size];
        System.out.println("enter the weight of items");
        for(int i=0;i<size;i++){
            w[i] = sc.nextInt();
        }
        int[] v = new int[size];
        System.out.println("enter the value of items");
        for(int i=0;i<size;i++){
            v[i] = sc.nextInt();
        }
        int n = w.length;
        System.out.println("enter the capacity of knapsack");
        capacity = sc.nextInt();
        int[][] result=(knap(w, v, capacity));
        System.out.println(result[n][capacity]);
        sc.close();
    }
}
