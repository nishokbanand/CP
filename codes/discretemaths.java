import java.util.Scanner;
public class discretemaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int x = 0;
        int [] flag = new int[testcase];
        while(x != testcase){
            int size = sc.nextInt();
            int threshold = sc.nextInt();
            int count =0;
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] <= 0){
                    count++;
                }
            }
            if(count < threshold){
                flag[x] = 1;
            }
            else{
                flag[x] = 0;
            }
            x++;
        }
       for (int i = 0; i < flag.length; i++) {
           if(flag[i] == 1){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
       }
       sc.close();
    }   
}
