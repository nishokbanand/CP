import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * F_3_SUM
 */
public class F_3_SUM {
    static String f_3_sum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, 1);
        }
        for (int num : arr) {
            map.put(num % 10, map.get(num % 10) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            int num1 = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int num2 = arr[j];
                int res = num2 + num1;
                map.put(num1 % 10, map.get(num1 % 10) - 1);
                map.put(num2 % 10, map.get(num2 % 10) - 1);
                switch (res % 10) {
                    case 1: {
                        if (map.get(2) != 1)
                            return "YES";
                        break;
                    }
                    case 2: {
                        if (map.get(1) != 1)
                            return "YES";
                        break;
                    }
                    case 3: {
                        if (map.get(0) != 1)
                            return "YES";
                        break;
                    }

                    case 4: {
                        if (map.get(9) != 1)
                            return "YES";
                        break;
                    }

                    case 5: {
                        if (map.get(8) != 1)
                            return "YES";
                        break;
                    }

                    case 6: {
                        if (map.get(7) != 1)
                            return "YES";
                        break;

                    }

                    case 7: {
                        if (map.get(6) != 1)
                            return "YES";
                        break;
                    }

                    case 8: {
                        if (map.get(5) != 1)
                            return "YES";
                        break;
                    }
                    case 9: {
                        if (map.get(4) != 1)
                            return "YES";
                        break;
                    }
                    case 0: {
                        if (map.get(3) != 1)
                            return "YES";
                        break;
                    }
                }
                map.put(num1 % 10, map.get(num1 % 10) + 1);
                map.put(num2 % 10, map.get(num2 % 10) + 1);
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int length = sc.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(f_3_sum(arr));
        }
        sc.close();
    }
}