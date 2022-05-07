import java.util.LinkedList;
import java.util.Scanner;

public class removeduplicateletters {
    static String removedups(String str) {
        int[] freq = new int[26];
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }
        LinkedList<Character> list = new LinkedList<>();
        boolean[] visited = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']--;
            if (visited[str.charAt(i) - 'a']) {
                continue;
            }
            while (!list.isEmpty() && !visited[str.charAt(i) - 'a'] && list.getLast() > str.charAt(i)
                    && freq[list.getLast() - 'a'] > 0) {
                visited[list.removeLast() - 'a'] = false;
            }
            list.add(str.charAt(i));
            visited[str.charAt(i) - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!list.isEmpty()) {
            sb.append(list.removeFirst());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removedups(str));
        sc.close();

    }

}
