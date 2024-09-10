import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * bit_man
 */
public class bit_man {
    static String sort(String str) {
        Character[] ch = new Character[str.length()];
        for (int i = 0; i < ch.length; i++)
            ch[i] = str.charAt(i);
        Arrays.sort(ch, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.compare(Character.toLowerCase(o1), Character.toLowerCase(o2));
            }
        });
        StringBuilder sb = new StringBuilder();
        for (char c : ch)
            sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = new int[] { 2, 3, 4, 1, 2, 5 };
        // Arrays.sort(arr);
        // for (int num : arr)
        // System.out.println(num);

        int[] a = new int[] { 5, 4, 2, 1, 3 };
        int[] b = new int[] { 5, 2, 3, 7 };
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        while (p1 < a.length && p2 < b.length) {
            if (a[p1] == b[p2]) {
                System.out.println(a[p1]);
                p1++;
                p2++;
            } else if (a[p1] > b[p2])
                p2++;
            else
                p1++;
        }
        sc.close();
    }
}