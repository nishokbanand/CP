import java.util.Arrays;
import java.util.Collections;

public class largenumdiv3 {
    public static int solution(int[] l) {
        l = Arrays.stream(l).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        int sum = Arrays.stream(l).sum();
        int mod = sum % 3;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < l.length; i++) {
            if (l[i] % 3 == 1)
                count1++;
            if (l[i] % 3 == 2)
                count2++;
        }
        if (mod != 0) {
            if (mod == 1) {
                if (count1 > 0) {
                    for (int i = l.length - 1; i >= 0; i--) {
                        if (l[i] % 3 == mod) {
                            l[i] = -1;
                        }
                    }
                } else {
                    for (int i = l.length - 1; i >= 0; i--) {
                        sum = Arrays.stream(l).filter(n -> n != -1).sum();
                        if (l[i] % 3 == 2 && sum % 3 != 0) {
                            l[i] = -1;
                        }
                    }
                }
            }
            if (mod == 2) {
                if (count2 > 0) {
                    for (int i = l.length - 1; i >= 0; i--) {
                        if (l[i] % 3 == mod) {
                            l[i] = -1;
                        }
                    }
                } else {
                    for (int i = l.length - 1; i >= 0; i--) {
                        sum = Arrays.stream(l).filter(n -> n != -1).sum();
                        if (l[i] % 3 == 1 && sum % 3 != 0) {
                            l[i] = -1;
                        }
                    }
                }
            }
        }
        int res = 0;
        for (int i = 0; i < l.length; i++) {
            if (l[i] != -1) {
                res = res * 10 + l[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] l = new int[] { 1, 4, 1, 1, 1, 3, 9 };
        System.out.println(solution(l));
    }
}