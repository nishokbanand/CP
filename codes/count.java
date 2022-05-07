import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int []count = new int[max+1];
        for (int i : arr) {
            count[i]++;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
}
