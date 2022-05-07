import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int times = sc.nextInt();
        int count =0,charcount=0;
        int temp = 0;
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a'){
                charcount++;
            }
        }
        int size = str.length();
        while(times!=temp){
             res += (str.substring(0,size));;
             temp++;
        }
        res = res.substring(0,times);
        if(res.length()%times == 0){
            charcount = charcount*times;
        }
        else{
            for (int i = 0; i < res.length(); i++) {
                if(res.charAt(i) == 'a'){
                    count++;
    
                }
             }
        }
        if(count!=0)System.out.println(count);
        else{
            System.out.println(charcount);
        }
    }
       
}
