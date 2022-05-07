import java.util.Scanner;

public class sumaaszero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int counter = 0;
        for (int i = 1; i < (1 << arr.length); i++) {
            int sum = 0;
            for (int bmi = 0; bmi < arr.length; bmi++) {
                if ((i & (1 << bmi)) != 0) {
                    sum += arr[bmi];
                }
            }
            if (sum == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
