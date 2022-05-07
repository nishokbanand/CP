import java.util.Scanner;

public class unqiuecharlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        int start = 0, end = 0, unique = 0, max = 0;
        int[] arr = new int[128];
        arr[str.charAt(end)] = 1;
        unique = 1;
        int rstart = 0;
        int rend = 0;
        while (end < str.length()) {
            if (k == unique) {
                int curr = end - start + 1;
                if (curr > max) {
                    max = curr;
                    rstart = start;
                    rend = end;
                }
            }
            if (unique <= k) {
                end++;
                if (end < str.length()) {
                    arr[str.charAt(end)]++;
                    if (arr[str.charAt(end)] == 1) {
                        unique++;
                    }
                }
            } else {
                arr[str.charAt(start)]--;
                if (arr[str.charAt(start)] == 0) {
                    unique--;
                }
                start++;
            }
        }
        System.out.println(str.substring(rstart, rend + 1));
    }
}
