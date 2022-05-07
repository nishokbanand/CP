import java.util.Scanner;

public class commoninstringsnminus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        int[] ascii = new int[128];
        for (int i = 0; i < n; i++) {
            String str = arr[i];
            int[] currcount = new int[128];
            for (int j = 0; j < str.length(); j++) {
                if (currcount[str.charAt(j)] == 0 && (ascii[str.charAt(j)] == i || ascii[str.charAt(j)] == i - 1)) {
                    ascii[str.charAt(j)]++;
                    currcount[str.charAt(j)]++;
                }
            }
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (ascii[ch] == n || ascii[ch] == n - 1) {
                System.out.print(ch);
            }
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ascii[ch] == n || ascii[ch] == n - 1) {
                System.out.print(ch);
            }
        }
    }
}
