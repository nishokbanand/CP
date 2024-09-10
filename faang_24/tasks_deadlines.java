import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Tasks {
    int duration;
    int deadline;

    Tasks(int duration, int deadline) {
        this.duration = duration;
        this.deadline = deadline;
    }

}

public class tasks_deadlines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tasks[] tasks = new Tasks[4];
        for (int i = 0; i < 4; i++) {
            tasks[i] = new Tasks(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(tasks, new Comparator<Tasks>() {
            @Override
            public int compare(Tasks o1, Tasks o2) {
                return o1.duration - o2.duration;
            }
        });
        int ans = 0;
        int time = 0;
        for (int i = 0; i < 4; i++) {
            time += tasks[i].duration;
            ans += tasks[i].deadline - time;
        }
        System.out.println(ans);
        sc.close();
    }
}
