import java.util.Scanner;
public class binomial {     
    public static int findbin(int n, int k){
            int C[][] = new int[n+1][k+1];       
            for (int i=0;i <= n;i++) {
                for (int j=0;j <= min(i,k);j++){                 
                    if (j==0 || j==i)C[i][j] = 1;                 
                     else C[i][j] = C[i-1][j-1] + C[i-1][j];
                }
            }
        return C[n][k];
    } 
    static int min(int a, int b) {
        if(a<b) return a;
        return b;
     }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findbin(n, k));
        sc.close();
    }
}