
import java.util.Scanner;

public class ImplementStrStr {
    static int find(String a, String b) {
        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            int temp_i = i;
            while (i < a.length() && counter < b.length() && a.charAt(i) == b.charAt(counter)) {
                i++;
                counter++;
            }
            if (counter == b.length())
                return temp_i;
            i = temp_i;
            counter = 0;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        System.out.println(find(a, b));
        sc.close();
    }
}
