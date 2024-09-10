import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * graphs
 */
public class graphs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 5, 4, 3, 2, 1 };
        ArrayList<LinkedList<Integer>> adjlists = new ArrayList<LinkedList<Integer>>();
        for (int num : arr)
            adjlists.add(new LinkedList<>());
        adjlists.get(1).add(4);

        System.out.println(adjlists);
        sc.close();
    }
}