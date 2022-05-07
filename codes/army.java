import java.util.Scanner;

public class army {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int res =((rows+1)/2) * ((columns+1)/2);
        System.out.println(res);
    }
}
