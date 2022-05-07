import java.util.Stack;

class Node {
    char val;
    int count;

    Node(char val, int count) {
        this.val = val;
        this.count = count;
    }
}

public class remove_adj_2 {
    public static String removeDuplicates(String s, int k) {
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!st.isEmpty() && st.peek().val == s.charAt(i)) {
                st.peek().count++;
            } else {
                st.push(new Node(s.charAt(i), 1));
            }
            if (st.peek().count == k) {
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();

        for (Node n : st) {
            for (int i = 0; i < n.count; i++) {
                sb.append(n.val);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "deeedbbcccbdaa";
        int k = 3;
        System.out.println(removeDuplicates(str, k));
    }
}
