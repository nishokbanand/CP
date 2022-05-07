import java.security.DrbgParameters.Reseed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    static void Permutation(int []arr,boolean []used,List<List<Integer>> res , ArrayList<Integer> permu){
        if(permu.size() == arr.length){
            if(!res.contains(permu)){res.add(new ArrayList<>(permu));}    
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(!used[i]){
                used[i]=true;
                permu.add(arr[i]);
                Permutation(arr,used,res,permu);
                permu.remove(permu.size()-1);
                used[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        int a = 5/2;
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        int []arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] used = new boolean[arr.length];
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> permu = new ArrayList<>();
        Permutation(arr,used,res,permu);
        Iterator it = res.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
