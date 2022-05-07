import java.util.Scanner;
public class utopian {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int a[] = new int[testcase];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int count =0;
        while(count !=testcase){
            int height =1;
            for (int i = 0; i <= a[count]; i++) {
                if(i %2 == 0 && i!=0)height+=1;
                else if(i%2 ==1 && i!=0)height*=2; 
            }
            System.out.println(height);
            count++;
        }
        sc.close();
        
    }    
}
