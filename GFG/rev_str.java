import java.util.Scanner;

public class rev_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("[.]");
        str = "";
        for (int i = arr.length - 1; i >= 0; i--)
            str += arr[i] + ".";
        System.out.println(str.substring(0, str.length() - 1));
        sc.close();
    }
}
