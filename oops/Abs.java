public abstract class Abs {
    abstract void greet();

    private int x = 10;

    void hello() {
        System.out.println("hello");
    }

    int gettter() {
        return x;
    }

    void setter(int x) {
        this.x = x;
    }
}