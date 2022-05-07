import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class substring{
    static int substr(String s){
        HashMap <Character , Integer> a = new HashMap<>();
        int start = 0;
        int end = 0;
        int res= 0;
        int n = s.length();
        while(start < n  && end < n){
            char c = s.charAt(end);
            if(a.containsKey(c) && a.get(c) >= start){
                start = a.get(c)+1;
                a.put(c,end);
            }
            else{
                a.put(c,end);
            }
            res = Math.max(res,end-start+1);
            end++;
        }   
        return res;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(substr(s));
    }
}