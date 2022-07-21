package july2122;

public class Box {
    private double a;
    private double b;
    private double c;

    public Box(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double volume() {
        return a*b*c;
    }

    public boolean canBePutInto(Box box) {
        return ((!(this.a > box.a || this.a > box.b || this.a > box.c)) &&
                (!(this.b > box.a || this.b > box.b || this.b > box.c)) &&
                (!(this.c > box.a || this.c > box.b || this.c > box.c)));
    }
}
