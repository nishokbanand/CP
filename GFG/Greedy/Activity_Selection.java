import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Activity_Selection
 */
public class Activity_Selection {
    static class obje {
        int start;
        int end;

        obje(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    static int select_act(int[] start, int[] end) {
        obje[] arr = new obje[start.length];
        for (int i = 0; i < start.length; i++) {
            arr[i] = new obje(start[i], end[i]);
        }
        Arrays.sort(arr, new Comparator<obje>() {
            @Override
            public int compare(obje o1, obje o2) {
                return o1.end - o2.end;
            }
        });
        int res = 1;
        int i = 0;
        for (int j = 1; j < start.length; j++) {
            if (arr[j].start > arr[i].end) {
                res++;
                i = j;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] start = new int[size1];
        for (int i = 0; i < size1; i++) {
            start[i] = sc.nextInt();
        }
        int[] end = new int[size1];
        for (int i = 0; i < end.length; i++) {
            end[i] = sc.nextInt();
        }
        System.out.println(select_act(start, end));
        sc.close();
    }
}