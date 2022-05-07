import java.util.Scanner;
public class fine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initial[] = new int[3];
        int returned[] = new int[3];
        for (int i = 0; i < initial.length; i++) {
            initial[i] = sc.nextInt();
        }
        for (int i = 0; i < returned.length; i++) {
            returned[i] = sc.nextInt();
        }
        int fine = 0;
        if(returned[2] - initial[2] ==0){
            if(returned[1] - initial[1] ==0){
                fine = (returned[0] - initial[0])*15;
            }
            else{
            fine = (returned[1] - initial[1])*500;
            }
        }
        else{
            fine = 10000;
        }
        System.out.println(Math.abs(fine));
    }
}
