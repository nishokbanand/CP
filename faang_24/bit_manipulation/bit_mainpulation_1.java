/**
 * bit_mainpulation_1
 */
public class bit_mainpulation_1 {

    public static void main(String[] args) {
        int x = 0;
        x |= (1 << 1);
        x |= (1 << 3);
        x |= (1 << 8);
        System.out.println(x);
        for (int i = 31; i >= 0; i--) {
            if ((x & (1 << i)) != 0)
                System.out.println(i);
        }

        int y = 32;
        System.out.println((y & (y - 1)) == 0);
    }
}