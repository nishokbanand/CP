import java.util.Scanner;

public class jumbled {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[10];
        for (char ch : str.toCharArray()) {
            if (ch == 'z')
                freq[0]++;
            if (ch == 'w')
                freq[2]++;
            if (ch == 'x')
                freq[6]++;
            if (ch == 'g')
                freq[8]++;
            if (ch == 'v')
                freq[5]++;
            if (ch == 's')
                freq[7]++;
            if (ch == 'i')
                freq[9]++;
            if (ch == 'o')
                freq[1]++;
            if (ch == 'f')
                freq[4]++;
            if (ch == 'h')
                freq[3]++;
        }
        freq[7] -= freq[6];
        freq[5] -= freq[7];
        freq[4] -= freq[5];
        freq[1] -= (freq[2] + freq[4] + freq[0]);
        freq[3] -= freq[8];
        freq[9] -= (freq[5] + freq[6] + freq[8]);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < freq[i]; j++) {
                ans.append((char) (i + '0'));
            }
        }
        System.out.println(ans.reverse().toString());
        sc.close();
    }

}
