import java.util.HashMap;
import java.util.Scanner;

public class Roman_To_Integer {
    static int roman_to_int(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        // VI III
        int result = map.get(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            result += map.get(str.charAt(i));
            if (map.get(str.charAt(i)) > map.get(str.charAt(i - 1))) {
                result = result - 2 * map.get(str.charAt(i - 1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(roman_to_int(input));
        sc.close();
    }
}
