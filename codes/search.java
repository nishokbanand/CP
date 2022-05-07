import java.util.Scanner;

public class search {
    static int searcher(int []arr,int target){
        int left =0;
        int right =arr.length-1;
        while(left<right){
            int midpoint = left + (right-left)/2;
            if(arr[midpoint]>arr[right]){
                left = midpoint+1;
            }
            else{
                right = midpoint;
            }
        }
        int start = left;
        left =0;
        right = arr.length-1;
        if(target <= arr[right] && target >= arr[start]){
            left = start;
        }
        else{
            right = start;
        }
        while(left <= right){
            int midpoint = left + (right-left) /2;
            if(target == arr[midpoint]){
                return midpoint;
            }
            else if(target <= arr[midpoint]){
                right = start;
            }
            else if(target >= arr[midpoint]){
                left = start+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int []arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(searcher(arr,target)); 
    }
}
