package july2122;

import java.util.Arrays;

public class Box {
    private double a;
    private double b;
    private double c;

    public Box(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Box(double[] dims) {
        this.a = dims[0];
        this.b = dims[1];
        this.c = dims[2];
    }

    public double volume() {
        return a*b*c;
    }

    public boolean canBePutInto(Box box) {
        boolean canBePutInto = true;
        double[] dims1 = new double[]{this.a, this.b, this.c};
        double[] dims2 = new double[]{box.a, box.b, box.c};
        Arrays.sort(dims1);
        Arrays.sort(dims2);

        for (int i = 0; i < dims1.length; i++) {
            if (dims1[i] < dims2[i]) {
                canBePutInto = false;
                break;
            }
        }

        return canBePutInto;
    }
}
