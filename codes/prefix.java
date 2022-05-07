import java.util.Scanner;

public class prefix {
    static String commonprefix(String[]strs){
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String []strs = new String[sc.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = sc.next();
        // }
        // for (int i = 0; i < strs.length; i++) {
        //     System.out.println(strs[i].indexOf("flow"));
        // }
        // System.out.println( commonprefix(strs));
    }
    }
}
