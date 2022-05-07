import java.util.HashMap;
import java.util.Scanner;

public class alphabetnumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int counter = 0, position = 0, maxlength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(counter, position);
        for (char ch : a.toCharArray()) {
            position++;
            if (Character.isAlphabetic(ch)) {
                counter++;
            } else {
                counter--;
            }
            if (map.containsKey(counter)) {
                int currlength = position - map.get(counter);
                maxlength = Math.max(maxlength, currlength);
            } else {
                map.put(counter, position);
            }
        }
        System.out.println(maxlength);
    }
}
