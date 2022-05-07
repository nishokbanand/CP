import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class FoodItem implements Comparable<FoodItem> {
    String name;
    List<Integer> list = new ArrayList<>();

    @Override
    public int compareTo(FoodItem other) {
        return this.list.size() - other.list.size();
    }
}

public class intelligentchef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, FoodItem> map = new HashMap<>();
        List<Integer> remaining = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            remaining.add(i);
            String preferences[] = sc.nextLine().split("\\s+");
            for (String str : preferences) {
                if (!map.containsKey(str)) {
                    FoodItem fi = new FoodItem();
                    fi.name = str;
                    fi.list = new ArrayList<>();
                    map.put(str, fi);
                }
                map.get(str).list.add(i);
            }
        }
        int count = 0;
        while (!remaining.isEmpty()) {
            List<FoodItem> items = new ArrayList<>(map.values());
            Collections.sort(items, Collections.reverseOrder());
            FoodItem mostpreffered = items.get(0);
            count++;
            map.remove(mostpreffered.name);
            remaining.removeAll(mostpreffered.list);
            for (String item : map.keySet()) {
                map.get(item).list.removeAll(mostpreffered.list);
            }
        }
        System.out.println(count);
    }
}
