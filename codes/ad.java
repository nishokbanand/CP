import java.util.Scanner;
public class ad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int liked =0;
        int shared = 5;
        int res=0;
        for (int i = 1; i <= days; i++) {
            liked= Math.floorDiv(shared, 2);
            shared = liked*3;
            res = res+liked;
        }
        System.out.println(res);
    }
}
