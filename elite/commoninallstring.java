import java.util.Scanner;

public class commoninallstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int[] ascii = new int[128];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            for (int j = 0; j < str.length(); j++) {
                if (ascii[str.charAt(j)] == i) {
                    ascii[str.charAt(j)]++;
                }
            }
        }
        for (char ch = 'A'; ch < 'Z'; ch++) {
            if (ascii[ch] == n) {
                System.out.print(ch);
            }
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ascii[ch] == n) {
                System.out.print(ch);
            }
        }
    }
}
