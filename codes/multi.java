import java.util.*;

public class multi {
    public static void multiply(int a, int b) {
        int lengthofa = length(a);
        int lengthofb = length(b);
        if (!power(length(a))) {
            lengthofa = nextpower(a);
        }
        if (!power(length(b))) {
            lengthofb = nextpower(b);
        }
        int max = (lengthofa < lengthofb) ? lengthofb : lengthofa;
        String d = "%0" + max + "d";
        String x = String.format(d, a);
        String y = String.format(d, b);
        int xx = Integer.parseInt(x);
        int yy = Integer.parseInt(y);
         System.out.println(dac(x,y,max));
       
    }

    public static String dac(String a, String b, int max) {
        String a1 = "", a2 = "", b1 = "", b2 = "";
        if (max <= 1) {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            String result = Integer.toString(x * y);
            return result;
        }
        a1 = a.substring(0, max / 2);
        a2 = a.substring(max / 2, max);
        b1 = b.substring(0, max / 2);
        b2 = b.substring(max / 2, max);
        String A = dac(a1, b1, max / 2);
        String B = dac(a2, b1, max / 2);
        String C = dac(a1, b2, max / 2);
        String D = dac(a2, b2, max / 2);
        return Integer.toString((Integer.parseInt(A) * (int) Math.pow(10, max))
                + ((Integer.parseInt(B) + Integer.parseInt(C)) * (int) Math.pow(10, max / 2)) + Integer.parseInt(D));
    }

    public static int karatsuba(int a, int b, int max) {
        if (max <= 1) {
            return (a * b);
        }
        String a1 = "", a2 = "", b1 = "", b2 = "";
        String aa = Integer.toString(a);
        String bb = Integer.toString(b);
        a1 = aa.substring(0, max / 2);
        a2 = aa.substring(max / 2, max);
        int a11 = Integer.parseInt(a1);
        int a22 = Integer.parseInt(a2);
        b1 = bb.substring(0, max / 2);
        b2 = bb.substring(max / 2, max);
        int b11 = Integer.parseInt(b1);
        int b22 = Integer.parseInt(b2);
        int A = karatsuba(a11, b11, max / 2);
        int B = karatsuba(a22, b22, max / 2);
        int C = karatsuba(a11 + a22, b11 + b22, max / 2);
        return ((A * (int) Math.pow(10, max)) + ((C - A - B) * (int) Math.pow(10, max / 2)) + B);
    }

    public static boolean power(int a) {
        while (a % 2 != 0) {
            if (a != 1)
                return false;
            a = a / 2;
        }
        return true;
    }

    public static int length(int a) {
        int temp = 1;
        int count = 0;
        while (temp <= a) {
            temp = temp * 10;
            count++;
        }
        return count;
    }

    public static int nextpower(int a) {
        int c = length(a);
        int b = 1;
        while (b < c) {
            b = b << 1;
        }
        return b;
    }

    public static void main(String[]args){
        int a,b;
        System.out.println("enter two nummbers");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        multiply(a, b);
        sc.close();
        int start = System.nanoTime();
        String res = dac(a,b);
        int end = System.nanoTime();
        System.out.println("DAC Multiplication: "+res);
        System.out.print("Time Complexity (DAC): ");
        System.out.println(count_dac + " Multiplications.");
        start = System.nanoTime();
        res = Karatsuba(a,b,power);
        end = System.nanoTime();
        System.out.println("Karatsuba Multiplication: "+res);
        System.out.print("Time Complexity (Karatsuba): ");
        System.out.println(count_kar + " Multiplications.")
        
    
}
