import java.util.Random;
import java.io.*;
import java.util.Scanner;
import java.util.function.LongBinaryOperator;
public class multiply_large_int {
        public static void multiply(long a, long b) {
            long lengthofa = numLength(a);
            long lengthofb = numLength(b);
            if (!power(numLength(a))) {
                lengthofa = nextpower(a);
            }
            if (!power(numLength(b))) {
                lengthofb = nextpower(b);
            }
            LongBinaryOperator max = (lengthofa < lengthofb) ? lengthofb : lengthofa;
            String d = "%0" + max + "d";
            String x = String.format(d, a);
            String y = String.format(d, b);
            int xx = Integer.parseInt(x);
            int yy = Integer.parseInt(y);
            System.out.println(dac(x,y,max));  
        }
        public static String dac(String a, String b, long max) {
            String a1 = "", a2 = "", b1 = "", b2 = "";
            if (max <= 1) {
                long x = Integer.parseInt(a);
                long y = Integer.parseInt(b);
                String result = Long.toString(x * y);
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
            return Integer.toString((Integer.parseInt(A) * (int) Math.pow(10, max))+ ((Integer.parseInt(B) + Integer.parseInt(C)) * (int) Math.pow(10, max / 2)) + Integer.parseInt(D));
        }
    public static boolean power(long a) {
        while (a % 2 != 0) {
            if (a != 1)
                return false;
            a = a / 2;
        }
        return true;
    }

    public static long numLength(long a) {
        long temp = 1;
        long count = 0;
        while (temp <= a) {
            temp = temp * 10;
            count++;
        }
        return count;
    }

    public static long nextpower(long a) {
        long c = numLength(a);
        long b = 1;
        while (b < c) {
            b = b << 1;
        }
        return b;
    }

    public static long kmul(long x, long y) {
        long noOneLength = numLength(x);
        long noTwoLength = numLength(y);
        long maxNumLength = Math.max(noOneLength, noTwoLength);
        long smallValue = 1 << 4;
        if (maxNumLength < smallValue)
            return x * y;
        maxNumLength = (maxNumLength / 2) + (maxNumLength % 2);
        long maxNumLengthTen = (long) Math.pow(10, maxNumLength);
        long b = x / maxNumLengthTen;
        long a = x - (b * maxNumLengthTen);
        long d = y / maxNumLengthTen;
        long c = y - (d * maxNumLength);
        long z0 = kmul(a, c);
        long z1 = kmul(a, d);
        long z2 = kmul(b, c);
        return z0 + ((z1 - z0 - z2) * maxNumLengthTen) + (z2 * (long) (Math.pow(10, 2 * maxNumLength)));
    }

public static void main(String[] args){
    Random r = new Random();
    Scanner scan = new Scanner(System.in);
    System.out.println("\nEnter the number of test cases: ");
    long t = scan.nextInt();
    long digits=100;
    while(0<t){
    long r_int1= r.nextLong(digits);
    long r_int2= r.nextLong(digits);
    System.out.println("\nNumber 1 :"+r_int1);
    System.out.println("Number 2 :"+r_int2);
    System.out.println("Length of the Number:"+String.valueOf(r_int1).length());
    System.out.println("\nDAC METHOD");long start = System.nanoTime();
    long product = dac(r_int1, r_int2);
    System.out.println("Product : " + product);
    long end = System.nanoTime();
    long execution = end - start;
    System.out.println("Execution time: " + execution + " nanoseconds");
    System.out.println("\nKARATSUBA METHOD");
    long start_2 = System.nanoTime();
    long product_2 = kmul(r_int1, r_int2);
    System.out.println("Product : " + product_2);
    long end_2 = System.nanoTime();
    long execution_2 = end_2 - start_2;
    System.out.println("Execution time: " + execution_2 + "nanoseconds\n\n");
    t--;
    digits=digits*10;
    } 
    }
    }