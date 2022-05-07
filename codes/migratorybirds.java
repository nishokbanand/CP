import java.util.Scanner;
public class migratorybirds {
    public static class bird{
        int id;
        int count;
        bird(int id,int count){
            this.id = id;
            this.count = count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        bird [] birds;
        birds = new bird[size];
        for(int i =0 ;i<size;i++){
            birds[i] = new bird(sc.nextInt(),0);
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(birds[i].id == birds[j].id){
                    birds[i].count++;
                }
            }
        }
        /*for (int i = 0; i < birds.length; i++) {
            System.out.print(birds[i].count+" ");
        }*/
        int id=birds[0].id;
        int max = birds[0].count;
        for(int i = 0;i<size;i++){
            if(max<birds[i].count){
                max = birds[i].count;
                id =birds[i].id;
            }
        }
        System.out.println(id);
        sc.close();
    }
}
