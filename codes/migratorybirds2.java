import java.util.Scanner;
public class migratorybirds2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int [] a = new int[size];
        for (int i = 0; i < arr.length; i++) {
            a[arr[i]] +=1;
        }
        int id = size-1;
        int max = a[size -1];
        for (int i = 0; i < a.length; i++) {
            if(max < a[i]){
                max = a[i];
                id= i;        
            }
        }
        System.out.println(id);
        sc.close();
    }
}
