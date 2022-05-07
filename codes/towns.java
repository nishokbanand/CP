import java.util.Scanner;

public class towns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int res[] = new int[testcases];
        for (int i = 0; i < res.length; i++) {
            res[i] =1;
        }
        for (int i = 0; i < testcases; i++) {
            int cities = sc.nextInt();
            int [] roads = new int [cities];
            for (int j = 0; j < roads.length-1; j++) {
                roads[i] = sc.nextInt();
                res[i]*=roads[i];
                res[i] = res[i]%123456;
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
