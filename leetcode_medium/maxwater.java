import java.util.Scanner;

public class maxwater {
    static int max(int[] containers) {
        int left = 0;
        int right = containers.length - 1;
        int capacity = 0;
        while (left < right) {
            capacity = Math.max(capacity, (right - left) * Math.min(containers[left], containers[right]));
            if (containers[left] < containers[right]) {
                left++;
            } else {
                right--;
            }
        }
        return capacity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] containers = new int[sc.nextInt()];
        for (int i = 0; i < containers.length; i++) {
            containers[i] = sc.nextInt();
        }
        System.out.println(max(containers));
        sc.close();
    }
}
