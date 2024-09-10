import java.util.HashSet;
import java.util.Scanner;

/**
 * D_The_Clock
 */
public class D_The_Clock {
    static int the_clock(String curr_time, int lookup_time) {
        int res = 0;
        int hours = Integer.parseInt(curr_time.split(":")[0]);
        int mins = Integer.parseInt(curr_time.split(":")[1]);
        HashSet<String> set = new HashSet<>();
        set.add("0:0");
        set.add("1:10");
        set.add("2:20");
        set.add("3:30");
        set.add("4:40");
        set.add("5:50");
        set.add("10:1");
        set.add("11:11");
        set.add("12:21");
        set.add("13:31");
        set.add("14:41");
        set.add("15:51");
        set.add("20:2");
        set.add("21:12");
        set.add("22:22");
        set.add("23:32");

        int temp_hours = hours;
        int temp_mins = mins;
        do {
            String hours_mins = hours + ":" + mins;
            if (set.contains(hours_mins))
                res++;
            mins += lookup_time;
            int quotient = mins / 60;
            hours = (hours + quotient) % 24;
            int remainder = mins % 60;
            mins = remainder;
        } while (hours != temp_hours || mins != temp_mins);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            String curr_time = sc.next();
            int lookup_time = sc.nextInt();
            System.out.println(the_clock(curr_time, lookup_time));
        }
    }
}