import java.util.Scanner;

public class zigzagconv {
    static String conv(String str, int rows) {
        StringBuilder[] sb = new StringBuilder[rows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }
        int i = 0;
        while (i < str.length()) {
            for (int idex = 0; idex < rows && i < str.length(); idex++) {
                sb[idex].append(str.charAt(i++));
            }
            for (int idex = rows - 2; idex >= 1 && i < str.length(); idex--) {
                sb[idex].append(str.charAt(i++));
            }
        }
        for (int j = 1; j < sb.length; j++) {
            sb[0].append(sb[j]);
        }
        return sb[0].toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int rows = sc.nextInt();
        System.out.println(conv(str, rows));
        sc.close();
    }
}
