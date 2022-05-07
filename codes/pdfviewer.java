import java.util.Scanner;
public class pdfviewer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 26;
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        String str = sc.next();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int a = (int) str.charAt(i)-97;
            int x = arr[a];
            if(max < x){
                max = x;
            }
        }
        System.out.println(max*str.length());
        sc.close();
    }  
}
