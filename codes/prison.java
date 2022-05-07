import java.util.Scanner;

public class prison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int [] res = new int[testcase];
        int counter =0;
        while (testcase != 0) {
            int prisoners = sc.nextInt();
            int sweets = sc.nextInt();
            int starting = sc.nextInt();
            int r = sweets%prisoners;
            if((r+starting-1) % prisoners == 0){
                res[counter] = prisoners;
            }
            else{
                res[counter] = (r+starting-1) % prisoners;
            }
            counter++;
            testcase--;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
