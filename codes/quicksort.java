import java.io.*;
import java.util.Scanner;
public class quicksort {
    public static void Quick(int arr[],int low,int high){
        if(low<high){
            int pi =part(arr,low,high);
            Quick(arr,low , pi-1);
            Quick(arr,pi+1,high);
        }
    }
    public static int part(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;
        int temp1,temp2=0;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                temp1 = arr[j];
                arr[j] = arr[i];
                arr[i] = temp1;
            }
        }
       temp2 = arr[i+1];
       arr[i+1] = arr[high];
       arr[high] = temp2;
        return (i+1);
    }
    static void printArray(int[] arr, int size)
{
    for(int i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
         
    System.out.println();
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("enter the size");
        size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Quick(arr,0,size-1);
        printArray(arr, size);
    }
}
