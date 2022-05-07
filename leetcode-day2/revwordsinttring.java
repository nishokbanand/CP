import java.util.Scanner;

public class revwordsinttring {
    static String revwords(String str) {
        String[] strings = str.split(" ");
        StringBuilder sb = new StringBuilder();
        String res = "";
        for (String string : strings) {
            sb = new StringBuilder(string);
            sb = sb.reverse();
            res = res + " " + sb.toString();
        }
        return res.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(revwords(str));
        sc.close();
    }
}
