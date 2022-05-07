import java.util.*;
public class coinchange {
    static int min(int a,int b){
        if(a < b)return a;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int balance = sc.nextInt();
        int T[] = new int[n];
        for(int i = 0;i < n;i++)T[i] = sc.nextInt();    
        sc.close();    
        Arrays.sort(T);
        int result[][] = new int[T.length+1][balance+1];
        for(int i = 1;i < balance+1;i++)result[0][i] = Integer.MAX_VALUE;
        for(int i = 0;i < T.length+1;i++)result[i][0] = 0;
        for(int i = 1;i < T.length+1;i++){
            for(int j = 1;j < balance+1;j++){
                if(j < T[i-1]) result[i][j] = result[i-1][j];
                else result[i][j] = min(result[i-1][j],1+result[i][j-T[i-1]]);
            }
        }
        System.out.println(result[T.length][balance]);
    }
}
