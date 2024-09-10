import java.util.Scanner;
import java.util.Stack;

/**
 * Paranthesis_Checker
 */
public class Paranthesis_Checker {
    static boolean checker(String str) {
        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{')
                st.push(ch);
            else if (ch == ')' && !st.isEmpty()) {
                if (st.peek() == '(')
                    st.pop();
                else
                    return false;
            } else if (ch == '}' && !st.isEmpty()) {
                if (st.peek() == '{')
                    st.pop();
                else
                    return false;
            } else if (ch == ']' && !st.isEmpty()) {
                if (st.peek() == '[')
                    st.pop();
                else
                    return false;
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checker(str));
        sc.close();
    }
}