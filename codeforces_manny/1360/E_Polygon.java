import java.util.Scanner;

/**
 * E_Polygon
 */
public class E_Polygon {
    static String polygoner(int[][] polygon) {
        for (int i = 0; i < polygon.length; i++) {
            for (int j = 0; j < polygon.length; j++) {
                if (polygon[i][j] == 1) {
                    if (i == polygon.length - 1 || j == polygon.length - 1)
                        continue;
                    else if (polygon[i + 1][j] == 1 || polygon[i][j + 1] == 1)
                        continue;
                    return "NO";
                }
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int[][] polygon = new int[size][size];
            for (int i = 0; i < size; i++) {
                String str = sc.next();
                for (int j = 0; j < polygon.length; j++) {
                    polygon[i][j] = str.charAt(j) - '0';
                }
            }
            System.out.println(polygoner(polygon));
        }
        sc.close();
    }
}