import java.util.Scanner;

/**
 * majorityelement
 */
public class majorityelement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int mjele = arr[0];
        int counter = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != mjele) {
                counter--;
                if (counter == 0) {
                    mjele = arr[i];
                    counter = 1;
                }

            } else {
                counter++;
            }
        }
        int count2 = 0;
        if (counter > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == mjele) {
                    count2++;
                }
            }
            if (count2 > arr.length / 2) {
                System.out.println(mjele);
            }
        } else
            System.out.println("No Majority Element");

    }
}