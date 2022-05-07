import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class multiplystring {
    static List<Integer> strmultiply(StringBuilder sb1, char ch, int numzeors) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < numzeors; i++) {
            res.add(0);
        }
        int carry = 0;
        for (int i = 0; i < sb1.length(); i++) {
            int mul = (ch - '0') * (sb1.charAt(i) - '0') + carry;
            carry = mul / 10;
            res.add(mul % 10);
        }
        if (carry != 0) {
            res.add(carry);
        }
        return res;
    }

    static StringBuilder sums(List<List<Integer>> res) {
        List<Integer> ans = new ArrayList<>(res.get(res.size() - 1));
        List<Integer> newans;
        for (int j = 0; j < res.size() - 1; j++) {
            List<Integer> num = new ArrayList<>(res.get(j));
            newans = new ArrayList<>();
            int carry = 0;
            for (int i = 0; i < num.size() || i < ans.size(); i++) {
                int digit1 = i < num.size() ? num.get(i) : 0;
                int digit2 = i < ans.size() ? ans.get(i) : 0;
                int sum = digit1 + digit2 + carry;
                carry = sum / 10;
                newans.add(sum % 10);
            }
            if (carry != 0) {
                newans.add(carry);
            }
            ans = newans;
        }
        StringBuilder temp = new StringBuilder();
        for (int digit : ans) {
            temp.append(digit);
        }
        return temp;
    }

    static String multiply(String num1, String num2) {
        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);
        sb1.reverse();
        sb2.reverse();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < sb2.length(); i++) {
            res.add(strmultiply(sb1, sb2.charAt(i), i));
        }
        StringBuilder result = sums(res);
        result.reverse();
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        System.out.println(multiply(num1, num2));
        sc.close();
    }
}