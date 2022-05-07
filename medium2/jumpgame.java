import java.util.Scanner;

public class jumpgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int lastgoodindex = arr.length - 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (i + arr[i] >= lastgoodindex) {
                lastgoodindex = i;
            }
        }
        System.out.println(lastgoodindex);
        sc.close();
    }
}
