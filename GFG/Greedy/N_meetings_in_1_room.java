import java.util.*;

public class N_meetings_in_1_room {
    static class meet {
        int start;
        int end;

        meet(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    static int no_of_meetings(int[] start, int[] end) {
        meet[] arr = new meet[start.length];
        for (int i = 0; i < start.length; i++) {
            arr[i] = new meet(start[i], end[i]);
        }
        Arrays.sort(arr, new Comparator<meet>() {
            @Override
            public int compare(meet o1, meet o2) {
                return o1.end - o2.end;
            }
        });
        int end_time = arr[0].end;
        int res = 1;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j].start > end_time) {
                end_time = arr[j].end;
                res++;
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
        System.out.println(no_of_meetings(start, end));
        sc.close();
    }
}
