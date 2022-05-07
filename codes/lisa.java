import java.util.Scanner;

public class lisa {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int problems = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res =0;
        int page =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                if(problems ==1 || j%problems == 1){
                    page++;
                }
                if(page == j){
                    res++;
                }
            }
        }
        System.out.println(res++);
        sc.close();
    }
}
