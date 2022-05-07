import java.util.Scanner;

public class triplets {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []alice = new int[3];
        int [] bob = new int[3];
        int []res = new int[2];
        for (int i = 0; i < alice.length; i++) {
            alice[i] = sc.nextInt();
        }
        for (int i = 0; i < bob.length; i++) {
            bob[i] = sc.nextInt();
        }
        for (int i = 0; i < alice.length; i++) {
            if(bob[i] > alice[i]){
                res[1]++;
            }
            else if(alice[i] > bob[i]){
                res[0]++;
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
