import java.util.Scanner;
public class catandmouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean caught = false;
        int query = sc.nextInt();
        String [] ans = new String[query];
        while(query!=0){
            int cat1 = sc.nextInt();
            int cat2 = sc.nextInt();
            int mouse = sc.nextInt();
                while(caught == false){
                if(cat2 < mouse)cat2++;
                if(cat1 < mouse)cat1++;
                if(cat2 > mouse) cat2--;
                if(cat1 > mouse) cat1--;
                if(cat1 == cat2){
                    ans[query-1] = "Mouse C";
                    break;
                 }
                else if(cat1 == mouse){
                    ans[query-1] = "Cat A";
                    caught = true;
                 }
                else if (cat2 == mouse){
                    ans[query-1] = "Cat B";
                    caught = true;
                }
            }
            //System.out.println(ans[query-1]);
            query--;
            caught = false;
        }
        for (int i = ans.length-1; i>=0 ;i--) {
            System.out.println(ans[i]);
        }
        sc.close();
         
    }
}
