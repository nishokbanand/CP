import java.util.Scanner;

public class sequence {
    static int[] permutation(int[] arr){
        int size = arr.length;
        int []res = new int[size];
        int x =1;
        int l=0,k=0;
        while(x<=size){
            l=0;
            k=0;
        for (int i = 0; i < res.length; i++) {
            if(arr[i] ==x){
               k = i+1;
            }
        }
        for (int i = 0; i < res.length; i++) {
            if(arr[i] == k){
                l = i+1;
            }
        }
        res[x-1] = l;
        x++;
    }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i =0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       int []res = permutation(arr);
       for (int i = 0; i < res.length; i++) {
           System.out.println(res[i]);
       }
    }
}
