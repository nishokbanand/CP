import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * photographheight
 */
public class photographheight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine[] = sc.nextLine().split(",");
        int N = Integer.parseInt(firstLine[0].trim());
        int K = Integer.parseInt(firstLine[1].trim());
        String names = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(0, N);
        List<String> photos = new ArrayList<>();
        for (int i = 1; i <= K; i++) {
            photos.add(sc.nextLine().trim().replaceAll(",", ""));
        }
        boolean missing = false;
        for (Character name : names.toCharArray()) {
            int relCount = 0;
            Queue<Character> queue = new ArrayDeque<>();
            List<Character> visited = new ArrayList<>();
            queue.add(name);
            visited.add(name);
            while (!queue.isEmpty()) {
                Character student = queue.poll();
                for (String seq : photos) {
                    if (seq.contains(student.toString())) {
                        String succ = seq.substring(seq.indexOf(student));
                        for (Character succStude : succ.toCharArray()) {
                            if (!visited.contains(succStude)) {
                                queue.add(succStude);
                                visited.add(succStude);
                                relCount++;
                            }
                        }
                    }
                }
            }
            queue.add(name);
            while (!queue.isEmpty()) {
                Character student = queue.poll();
                for (String seq : photos) {
                    if (seq.contains(student.toString())) {
                        String pred = seq.substring(0, seq.indexOf(student));
                        for (Character predStude : pred.toCharArray()) {
                            if (!visited.contains(predStude)) {
                                queue.add(predStude);
                                visited.add(predStude);
                                relCount++;
                            }
                        }
                    }
                }
            }
            if (relCount != N - 1) {
                System.out.print(name + " ");
                missing = true;
            }
        }
        if (!missing) {
            System.out.println("N/A");
        }
    }
}