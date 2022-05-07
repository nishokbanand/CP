import java.util.Scanner;

public class socks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int []res = new int[testcases];
        int counter=0;
        while(testcases!=0){
            int color = sc.nextInt();
            res[counter++] = color+1;
            testcases--;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
