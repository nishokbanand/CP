import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int []arr1 = new int[size1];
        int []arr2 = new int[size2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]%arr2[i]==0){
                
            }
        }
        sc.close();
    }
}
