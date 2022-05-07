import java.util.Scanner;

public class minparanthesis {

    public static String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                open++;
            else if (ch == ')') {
                if (open == 0)
                    continue;
                open--;
            }
            sb.append(ch);
        }
        StringBuilder result = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '(' && open-- > 0) {
                continue;
            }
            result.append(sb.charAt(i));
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(minRemoveToMakeValid(str));
        sc.close();
    }
}
