import java.util.Scanner;
import java.util.Stack;

public class paran {
    static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if(x=='(' || x=='[' || x=='{' ){
                st.push(x);
            }
            else{
                if(x == ')' && !st.isEmpty()&& st.peek() == '(')st.pop();
                if(x == '}' &&!st.isEmpty()&& st.peek() == '{')st.pop();
                if(x == ']' &&!st.isEmpty()&& st.peek() == '[')st.pop();
            }
        }
        return !st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println( isValid(s));
    }
}
