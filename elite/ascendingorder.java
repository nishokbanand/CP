import java.util.Scanner;

/**
 * ascendingorder
 */
public class ascendingorder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = n; i >= 1; i--) {
            arr[i] = sc.nextInt();
        }
        boolean visited[] = new boolean[n + 1];
        int totalswaps = 0;
        for (int index = 1; index <= n; index++) {
            if (visited[arr[index]]) {
                continue;
            }
            if (arr[index] == index) {
                visited[arr[index]] = true;
                continue;
            }
            int edges = 0, cycleindex = index;
            while (!visited[arr[cycleindex]]) {
                visited[arr[cycleindex]] = true;
                edges++;
                cycleindex = arr[cycleindex];
            }
            totalswaps += edges - 1;
        }
        System.out.println(totalswaps);

    }
}