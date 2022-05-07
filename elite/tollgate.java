import java.util.Scanner;

public class tollgate {
    static int getmaxcollection(int kms, int gap, int tolls, int[] tollDist, int[] tollfare) {
        int[] revenue = new int[kms + 1];
        revenue[0] = 0;
        int tollindex = 0;
        for (int i = 1; i <= kms; i++) {
            if (tollDist[tollindex] == i) {
                if (i <= gap) {
                    revenue[i] = Math.max(revenue[i - 1], tollfare[tollindex]);
                } else {
                    revenue[i] = Math.max(revenue[i - 1], tollfare[tollindex] + revenue[i - gap - 1]);
                }
                tollindex++;
                if (tollindex == tolls) {
                    return revenue[i];
                }
            } else {
                revenue[i] = revenue[i - 1];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), D = sc.nextInt(), K = sc.nextInt();
        int[] tolldist = new int[K];
        int[] tollfare = new int[K];
        for (int i = 0; i < K; i++) {
            tolldist[i] = sc.nextInt();
        }
        for (int i = 0; i < K; i++) {
            tollfare[i] = sc.nextInt();
        }
        System.out.println(getmaxcollection(N, D, K, tolldist, tollfare));
    }
}
