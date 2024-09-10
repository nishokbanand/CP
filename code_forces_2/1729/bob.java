import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.html.ParagraphView;

class pair {
    int x, y;

    pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int floor;

    pair(int x, int y, int floor) {
        this.x = x;
        this.y = y;
        this.floor = floor;
    }
}

public class bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pair[] pool = new pair[4];
        for (int i = 0; i < pool.length; i++) {
            pool[i] = new pair(sc.nextInt(), sc.nextInt());
        }
        int numofbuildings = sc.nextInt();
        int charge = sc.nextInt();
        int revenue = 0;
        pair[] buildings = new pair[numofbuildings];
        for (int i = 0; i < numofbuildings; i++) {
            buildings[i] = new pair(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        HashMap<pair, Integer> map = new HashMap<>();
        boolean flag = false;
        boolean flag2 = false;
        for (pair p : buildings) {
            flag = true;
            int floor = 0;
            for (pair pol : pool) {
                if (flag) {
                    if (p.x < 1 || p.y < 3) {
                        flag2 = false;
                        for (Map.Entry<pair, Integer> entry : map.entrySet()) {
                            if (!flag2) {
                                pair x = entry.getKey();
                                if (x.x == p.x) {
                                    flag2 = true;
                                    floor = x.floor;
                                }
                            }
                        }
                        if (!flag2) {
                            map.put(new pair(p.x, p.y), p.floor);
                            revenue += charge * p.floor;
                            flag = false;
                        } else {
                            if (floor < p.floor) {
                                revenue += charge * (p.floor - floor);
                            }
                            flag = false;
                        }
                    }
                }
            }
        }
        System.out.println(revenue);
    }
}
