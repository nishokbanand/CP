import java.util.Arrays;

public class Class1 implements Comparable<Class1>, Cloneable {
    int rollno;
    int marks;

    Class1() {

    }

    Class1(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Class1 o) {
        return this.marks - o.marks;
    }

    @Override
    public String toString() {
        return this.marks + "";
    }

    static public String toString(Class1[] cl) {
        String res = "";
        for (int i = 0; i < cl.length; i++) {
            res += cl[i].marks;
        }
        return res;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Class1 temp = (Class1) super.clone();
        temp.marks = this.marks;
        return temp;
    }
}
