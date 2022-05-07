import java.util.Scanner;
public class sherlockandsquares {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i;
       int queries = sc.nextInt();
       int[] counter =new int [queries];
       for (int j = 0; j < queries; j++) {
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (i = (int)Math.ceil(Math.sqrt(start)); i <= (int) Math.ceil(Math.sqrt(end)); i++) {
            if((i*i) >= start && (i*i) <= end){
                counter[j]++;
            }
        }
       }
       for (int j = 0; j < counter.length; j++) {
           System.out.println(counter[j]);
       }
    }
}
