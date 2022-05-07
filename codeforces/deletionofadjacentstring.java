import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class deletionofadjacentstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        ArrayList<String> res = new ArrayList<>();
        sc.nextLine();
        while (testcase > 0) {
            String str = sc.nextLine();
            char s = sc.nextLine().charAt(0);
            boolean flag = false;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == s) {
                    int left = i - 0;
                    int right = str.length() - i - 1;
                    if (left % 2 == 0 || right % 2 == 0) {
                        flag = true;
                        break;
                    }
                }
            }
            res.add(flag == true ? "yes" : "no");
            testcase--;
        }
        Iterator<String> it = res.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        sc.close();
    }
}
