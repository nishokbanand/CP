import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * map
 */
public class map {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('b', 17);
        map.put('a', 2);
        map.put('x', 8);
        // List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        // Collections.sort(list, (entry1, entry2) ->
        // entry1.getValue().compareTo(entry2.getValue()));
        Map<Character, Integer> res = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println(res);
    }
}