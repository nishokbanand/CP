
/**
 * reversepairs
 */
public class reversepairs {
    static int count = 0;

    // 2 4 3 5 1
    static int solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 2, 3, 1 };
        solution(arr);
        System.out.println(count);
        String order = "worldabcefghijkmnpqstuvxyz";
        StringBuilder str1 = new StringBuilder("word");
        StringBuilder str2 = new StringBuilder("world");
        for (int i = 0; i < str1.length(); i++)
            str1.setCharAt(i, order.charAt(str1.charAt(i) - 'a'));
        for (int i = 0; i < str2.length(); i++)
            str2.setCharAt(i, order.charAt(str2.charAt(i) - 'a'));
        System.out.println(str1.compareTo(str2));
    }
}