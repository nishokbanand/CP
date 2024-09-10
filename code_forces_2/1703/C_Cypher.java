import java.util.Scanner;

/**
 * C_Cypher
 */
public class C_Cypher {
    static int[] findinital(int[] wheels, String[] operations) {
        int n = wheels.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int num = wheels[i];
            String op = operations[i];
            for (char ch : op.toCharArray()) {
                if (ch == 'D') {
                    num++;
                    if (num == 10)
                        num = 0;
                } else {
                    num--;
                    if (num == -1)
                        num = 9;
                }
            }
            result[i] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int nofwheels = sc.nextInt();
            int[] wheels = new int[nofwheels];
            for (int i = 0; i < wheels.length; i++) {
                wheels[i] = sc.nextInt();
            }
            String[] operations = new String[nofwheels];
            for (int i = 0; i < operations.length; i++) {
                int notneeded = sc.nextInt();
                operations[i] = sc.next();
            }
            int[] res = findinital(wheels, operations);
            for (int num : res) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}