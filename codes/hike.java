import java.util.Scanner;
public class hike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        path = path.toUpperCase();
        long steps=0;
        long valley =0;
        for (long i = 0; i < path.length(); i++) {
            if(path.charAt((int) i) == 'U'){
                steps++;
                System.out.println(steps);
                if(steps == 0){
                    valley++;
                }
            }
            else if(path.charAt((int) i) == 'D'){
                steps--;
                System.out.println(steps);
            }
            }
            System.out.println("valley count"+valley);
            sc.close();
        }
    }
