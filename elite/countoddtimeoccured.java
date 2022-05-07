import java.util.Scanner;

public class countoddtimeoccured {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int curr;
        for (int i = 1; i <= n; i++) {
            curr = sc.nextInt();
            result = result ^ curr;
            System.out.println("Result curr " + result + " " + curr);
        }
        System.out.println(result);
    }
}
