import java.util.Scanner;

class treenode {
    int val;
    treenode left, right;

    treenode(int val) {
        this.val = val;
    }

    treenode(int val, treenode left, treenode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class maxdepthofbinarytree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.nextInt() != 0) {
            treenode root = new treenode(3);

        }
    }
}
