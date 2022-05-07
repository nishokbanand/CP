import java.util.Scanner;

public class addbinary {
    static String addbin(String a, String b) {
        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (len1 >= 0 || len2 >= 0) {
            int sum = carry;
            if (len1 >= 0)
                sum += a.charAt(len1--) - '0';
            if (len2 >= 0)
                sum += b.charAt(len2--) - '0';
            carry = sum > 1 ? 1 : 0;
            sb.append(sum % 2);
        }
        if (carry != 0)
            sb.append(1);
        return sb.reverse().toString();
        // int carry = 0;
        // StringBuilder sb = new StringBuilder();
        // StringBuilder sba = new StringBuilder(a);
        // StringBuilder sbb = new StringBuilder(b);
        // while (sba.length() != sbb.length()) {
        // if (sba.length() < sbb.length()) {
        // sba.append(0);
        // } else {
        // sbb.append(0);
        // }
        // }
        // String temp = "";
        // if (a.length() != sba.length()) {
        // for (int i = a.length(); i < sba.length(); i++) {
        // temp += sba.charAt(i);
        // }
        // a = temp + a;
        // }
        // if (b.length() != sbb.length()) {
        // for (int i = b.length(); i < sbb.length(); i++) {
        // temp += sbb.charAt(i);
        // }
        // b = temp + b;
        // }
        // int pointer1 = a.length() - 1;
        // while (pointer1 >= 0) {
        // int num1 = Integer.parseInt(Character.toString(a.charAt(pointer1)));
        // int num2 = Integer.parseInt(Character.toString(b.charAt(pointer1)));
        // if (num1 == 0 && num2 == 0) {
        // sb.append(num1 + num2 + carry);
        // carry = 0;
        // }
        // if ((num1 == 0 && num2 == 1) || (num1 == 1 && num2 == 0)) {
        // if (carry == 0) {
        // sb.append(1);
        // } else {
        // sb.append(0);
        // carry = 1;
        // }
        // }
        // if (num1 == 1 && num2 == 1) {
        // if (carry > 0) {
        // sb.append(1);
        // carry = 1;
        // } else {
        // sb.append(0);
        // carry = 1;
        // }
        // }
        // pointer1--;
        // }
        // if (carry > 0) {
        // sb.append(1);
        // }
        // return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(addbin(a, b));
        sc.close();
    }
}
