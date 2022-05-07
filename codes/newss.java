import java.util.Scanner;

public class newss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x=1;
        int res[] = new int[n];
        int counter=0;
        while(counter <=n){
            for (int i = 0; i < arr.length; i++) {
                if(x == arr[i]){
                    int temp =i;
                    for (int j = 0; j < res.length; j++) {
                        if(temp == arr[j]){
                            res[counter] = arr[j];
                            break;
                        }
                    }
                    break;
                }
            }
            counter++;
            x++;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);   
        }
        
    }
}
