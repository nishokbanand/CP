import java.util.Scanner;

public class snakearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int val = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < 2 * num - i; j++) {
                if (j < num - i)
                    System.out.print("_");
                else if (i % 2 != 0) {
                    System.out.print(++val);
                } else {
                    System.out.print(val--);
                }
            }
            val += num;
            System.out.println();
        }
        sc.close();
    }
}
