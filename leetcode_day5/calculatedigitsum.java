
public class calculatedigitsum {
    static String calc(String str, int k) {
        if (str.length() <= k)
            return str;
        StringBuilder sb = new StringBuilder();
        int val = 0;
        for (int i = 1; i <= str.length(); i++) {
            val += str.charAt(i - 1) - '0';
            System.out.println("val" + val);
            if (i % k == 0 || i == str.length()) {
                sb.append(val);
                val = 0;
            }
        }
        return calc(sb.toString(), k);
    }

    public static void main(String[] args) {
        String str = "11111222223";
        int k = 3;
        System.out.println(calc(str, k));
    }
}
