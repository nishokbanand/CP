import java.util.Scanner;

public class find_anagrams {
    static boolean find_ana(String a, String b) {
        int[] freq1 = new int[26];
        for (char ch : a.toCharArray()) {
            freq1[ch - 'a']++;
        }
        for (char ch : b.toCharArray()) {
            freq1[ch - 'a']--;
        }
        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(find_ana(a, b));
        sc.close();
    }
}
