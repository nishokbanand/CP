import java.util.Scanner;
import java.util.Stack;

public class scoreofparanthesis {
    static int score(String str) {
        Stack<Integer> st = new Stack<>();
        int score = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                st.push(score);
                score = 0;
            } else {
                score = st.pop() + Math.max(2 * score, 1);
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(score(str));
        sc.close();
    }
}
