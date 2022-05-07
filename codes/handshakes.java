import java.util.Scanner;
public class handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();
        int total = 0;
        for (int i = 1; i < persons; i++) {
            total+=1;
        }
        System.out.println(total);
    }
}
