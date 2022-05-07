import java.util.Scanner;

public class sherlock {
    static int gcd(int num1,int num2){
        if(num2 == 0){
            return num1;
        }
        return gcd(num2,num1%num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int rotations = sc.nextInt();
        int qsize = sc.nextInt();
        rotations = size - rotations;
        int[]arr = new int[size];
        int gcd_num = gcd(rotations,size);
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int [] queries = new int[qsize];
        for (int i = 0; i < queries.length; i++) {
            queries[i] = sc.nextInt();
        }
        int temp,j,k =0;
        for (int i = 0; i < gcd_num; i++) {
            temp = arr[i];
            j = i;
            while(true){
                k = j+rotations;
                if(k >= size){
                    k = k-size;
                }
                if(k==i){
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        for (int i = 0; i < queries.length; i++) {
            System.out.println(arr[queries[i]]);
        }
    }
}
