public class Hamming_dist {
    static int finddist(int a, int b) {
        int ans = a ^ b;
        for (int i = 31; i >= 0; i--) {
            if ((ans & (1 << i)) != 0)
                System.out.println(i);
        }
        return 0;
    }

    public static void main(String[] args) {
        int a = 0b1001;
        int b = 0b0001;
        System.out.println(finddist(a, b));
    }

}
