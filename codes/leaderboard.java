import java.util.*;
public class leaderboard {
    public static int binarysearch(int []scores , int alice){
        int start = 0;
        int end = scores.length-1;
        while(start <= end){
            int mid = start+ (end-start) /2;
            if(alice == scores[mid]){
                return mid;
            }
            else if(scores[mid] < alice && alice <= scores[mid-1]){
                return mid;
            }
            else if(scores[mid] > alice && alice >= scores[mid+1]){
                return mid+1;
            }
            else if(scores[mid] < alice){
                end = mid-1;
            }
            else if (scores[mid] > alice){
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scoresize = sc.nextInt();
        int [] score = new int[scoresize];
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }
        int playersize = sc.nextInt();
      
        int [] player = new int[playersize];
        int [] rank = new int[scoresize];
        rank[0] =1;
        
        for (int i = 0; i < player.length; i++) {
            player[i] = sc.nextInt();
        }
        for (int i = 1; i < score.length; i++) {
            if(score[i] == score[i-1]){
                rank[i] = rank[i-1];
            }
            else{
                rank[i] = rank[i-1]+1;
            }
        }
        int [] res = new int [playersize];
        for (int i = 0; i < playersize; i++) {
            int alice = player[i];
            if(score[0] < alice){
                res[i] = 1;
            }
            else if(alice < score [scoresize-1] ){
                res[i] = rank[scoresize-1]+1; 
            }
            else{
                int index = binarysearch(score,alice);
                res[i] = rank[index];
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        sc.close();
    }
}
