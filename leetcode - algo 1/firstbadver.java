import java.util.Scanner;

public class firstbadver {
    static boolean isBadVersion(int version) {
        if (version == 5 || version == 4)
            return true;
        return false;
    }

    class second {
        static int firstbadversion(int n) {
            int left = 0;
            int right = n;
            return badutil(left, right);
        }

        static int badutil(int left, int right) {
            while (left <= right) {
                int mid = (left + right) / 2;
                if (isBadVersion(mid) && !isBadVersion(mid - 1)) {
                    return mid;
                }
                if (isBadVersion(mid) && isBadVersion(mid - 1)) {
                    return badutil(left, mid - 1);
                }
                if (!isBadVersion(mid) && !isBadVersion(mid - 1)) {
                    return badutil(mid + 1, right);
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(firstbadversion(n));
            sc.close();
        }
    }

}
