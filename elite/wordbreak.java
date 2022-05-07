import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class wordbreak {
    public static void breakword(List<String> wordsList, String str, String output, int start) {
        if (start == str.length()) {
            System.out.println(output.trim());
            return;
        }
        for (int i = start; i < str.length(); i++) {
            String word = str.substring(start, i + 1);
            if (wordsList.contains(word)) {
                breakword(wordsList, str, output + word + " ", i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("\\s+");
        String str = sc.nextLine();
        List<String> wordsList = Arrays.asList(words);
        breakword(wordsList, str, "", 0);
    }
}
