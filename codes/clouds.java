import java.util.Scanner;
public class clouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int energy = 100;
        int x=0;
        do{
            x+=k;
            energy--;
            if(arr[x%size] ==1){
                energy-=2;
            }
        }while(x%size != 0);
        System.out.println(energy);
    }
}
