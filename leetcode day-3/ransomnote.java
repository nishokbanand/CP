import java.util.Scanner;

public class ransomnote {
    static boolean check(String ransomNote, String magazine) {
        int[] counter = new int[26];
        for (char ch : magazine.toCharArray()) {
            counter[ch - 'a']++;
        }
        for (char ch : ransomNote.toCharArray()) {
            if (counter[ch - 'a'] == 0)
                return false;
            counter[ch - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ransomnote = sc.nextLine();
        String magazine = sc.nextLine();
        System.out.println(check(ransomnote, magazine));
        sc.close();
    }
}
