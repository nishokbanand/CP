import java.util.Scanner;

public class divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        int [] res = new int[queries];
        int counter =0;
        while(queries !=0){
                int n = sc.nextInt();
                int temp =0;
                int temp2 = n;
                while(n!=0){
                    temp = n%10;
                    if(temp!=0 && temp2 % temp == 0){
                        res[counter]++;
                    }
                    n = n/10;
                }
        counter++;
        queries--;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
