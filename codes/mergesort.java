import java.util.*;
public class mergesort {
    static int[] mergeSort(int arr[],int low,int high){
        if(low<high){
            int middle = (int)Math.floor((low+high)/2);
            mergeSort(arr,low,middle);
            mergeSort(arr,middle+1,high);
            merge(arr,low,middle,high);
        }
        return arr;
    }
    static void merge(int arr[],int low,int middle,int high){
        int n1 = middle-low+1;
        int n2 = high-middle;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i] = arr[low+i];
        }
        for(int j=0;j<n2;j++){
            arr2[j] = arr[middle+1+j];
        }
        int i=0,j=0;
        int k=low;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
    public static int[] Quick(int arr[],int low,int high){
        if(low<high){
            int pi =part(arr,low,high);
            Quick(arr,low , pi-1);
            Quick(arr,pi+1,high);
        }
        return arr;
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
        public static void main(String[]args){
        System.out.println("Enter the number of test cases:");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        for(int j=0;j<x;j++){
            System.out.println("");
            System.out.println("Test Case: "+(j+1));
            System.out.println("");
            int size;
            System.out.println("enter the size of the array");
            size = sc.nextInt();
            int a[] = new int[size];
            Random rd = new Random();
            for(int i =0;i<size;i++){
                a[i] = rd.nextInt();
             }
        long t0=System.nanoTime();
        int [] b =mergeSort(a, 0, a.length-1);  
        long t1= System.nanoTime();
        System.out.println("Merge sort");
        System.out.println("Time taken - Merge Sort (in NanoSec): "+ (t1-t0));
        System.out.println();
        System.out.println("Quick sort");
        long t2=System.nanoTime();
        int[] c = Quick(a, 0, size-1);
        long t3=System.nanoTime();
        System.out.println("Time taken - Quick Sort (in NanoSec): "+ (t3-t2));
    }
}
}