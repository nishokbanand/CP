public class min_query {
    static int n;
    static int LOG = 17;

    static void min_q(int[] arr) {
        int[][] lookup = new int[n][LOG];
        // length =1
        for (int i = 0; i < lookup.length; i++) {
            lookup[i][0] = arr[i];
        }
        for (int j = 1; j < LOG; j++) {
            for (int i = 0; i + (1 << j) - 1 < n; i++) {
                lookup[i][j] = Math.min(lookup[i][j - 1], lookup[i + (1 << (j - 1))][j - 1]);
            }
        }
        int l = 0;
        int r = 4;
        int k = 0;
        int length = r - l + 1;
        while ((1 << k + 1) <= length) {
            k++;
        }
        System.out.println(Math.min(lookup[l][k - 1], lookup[r - k + 1][k - 1]));
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 16, 3, 4, 8, 6, 1, 4, 2 };
        n = arr.length;
        min_q(arr);
    }

}
