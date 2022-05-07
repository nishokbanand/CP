import java.util.Scanner;

/**
 * countnoofones
 */
public class countnoofones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        while (n != 0) {
            if ((n & 1) == 1)
                counter++;
            n = n >> 1;
        }
        System.out.println(counter);
    }
}