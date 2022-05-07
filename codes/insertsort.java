import java.util.*;
public class insertsort{
    public static void insert(int a[],int n){
        int i,j;
        for(i=1;i<n;i++){
           int k = a[i];
           j = i-1;
           while(j>0 && a[j]>a[i]){
                a[i] = a[j];
                j--;
           }       
           a[j+1] = k;
        }
    }
    public static void select(int a[],int n){
        int min;
        for(int i=0;i<n;i++){
            min = i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;

        }
    }
    public static void main(String[]args){
        int n,i;
        int a[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        n = sc.nextInt();
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        //insert(a,n);
        select(a,n);
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}