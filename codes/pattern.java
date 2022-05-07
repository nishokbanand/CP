import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prow = sc.nextInt();
        int pcol = sc.nextInt();
        String [][] pattern = new String[prow][pcol];
        for (int i = 0; i < prow; i++) {
            for (int j = 0; j < pcol; j++) {
                pattern[i][j] = sc.next();
            }
        }
        int srow = sc.nextInt();
        int scol = sc.nextInt();
        int [][] seq = new int[srow][scol];
        for (int i = 0; i < srow; i++) {
            for (int j = 0; j < scol; j++) {
                seq[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < srow; i++) {
            for (int j = 0; j < scol; j++) {
                int r =0;
                int c =0;
                if()
            }
        }
    }
}
