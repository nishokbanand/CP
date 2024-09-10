import java.util.Scanner;

/**
 * A_Everyone_Loves_to_Sleep
 */
public class A_Everyone_Loves_to_Sleep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int no_of_alrms = sc.nextInt(), hours = sc.nextInt(), minutes = sc.nextInt();
            int initaltime = 60 * hours + minutes;
            int ans = 24 * 60;
            while (no_of_alrms-- > 0) {
                int a_hours = sc.nextInt(), a_minutes = sc.nextInt();
                int a_time = 60 * a_hours + a_minutes - initaltime;
                if (a_time < 0) {
                    a_time += 24 * 60;
                }
                ans = Math.min(ans, a_time);
            }
            System.out.println(ans / 60 + " " + ans % 60);
        }
        sc.close();
    }
}