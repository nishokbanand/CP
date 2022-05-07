import java.util.Scanner;

public class equ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int index = str.indexOf("=");
        int index2 = str.indexOf("+");
        String substr = str.substring(index + 1);
        String substr2 = "";
        int num1 = Integer.parseInt(substr);
        if (str.charAt(0) == 'X') {
            substr2 = str.substring(index2 + 1, index);
        } else {
            substr2 = str.substring(0, index2);
        }
        int num2 = Integer.parseInt(substr2);
        System.out.println(num1 - num2);
        sc.close();
    }
}