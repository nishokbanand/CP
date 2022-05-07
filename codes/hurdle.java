import java.util.Scanner;

public class hurdle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int jump = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int res = max-jump;
        if(res > 0){
            System.out.println(res);
        }
        if(res<=0){
            System.out.println(0);
        }
        sc.close();
    }
}
