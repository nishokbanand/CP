import java.util.Scanner;
public class num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        } 
        int []fre = new int[101];
        for (int i = 0; i < arr.length; i++) {
            fre[arr[i]]++;
        }
        int result = Integer.MIN_VALUE;
        System.out.println(fre.length);
        for (int i = 1; i < fre.length; i++) {
            result = Math.max(result, fre[i]+fre[i-1]);
        }
        System.out.println(result);
        sc.close();
    }
    
}
