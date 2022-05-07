import java.util.Scanner;

public class flips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int counter = 0;
        int c = a ^ b;
        while (c != 0) {
            if ((c & 1) == 1) {
                counter++;
            }
            c = c >> 1;
        }
        System.out.println(counter);
    }
}
