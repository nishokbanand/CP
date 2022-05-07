import java.util.*;

public class mindistinctele {
    static int mindistinct(List<Integer> list, int operations) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : list) {
            map.put(num, map.get(num) == null ? 1 : map.get(num) + 1);
        }
        map = (HashMap<Integer, Integer>) sortmap(map);
        StringBuilder sb = new StringBuilder();
        System.out.println(map);
        while (true) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                while (entry.getValue() > 0 && operations > 0) {
                    System.out.println(entry);
                    entry.setValue(entry.getValue() - 1);
                    operations--;
                }
                if (entry.getValue() != 0)
                    sb.append(entry.getValue());
            }
            if (operations == 0)
                break;
        }
        int res = 0;
        for (char ch : sb.toString().toCharArray()) {
            int val = Integer.parseInt("" + ch);
            res += val;
        }
        return res;
    }

    static Map<Integer, Integer> sortmap(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        HashMap<Integer, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            temp.put(entry.getKey(), entry.getValue());
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            li.add(sc.nextInt());
        }
        int operations = sc.nextInt();
        System.out.println(mindistinct(li, operations));
        sc.close();
    }
}
