import java.lang.reflect.Array;
import java.util.Arrays;

public class Triangle extends Shape {
    private Point A;
    private Point B;
    private Point C;
    private final double[] sidesLength;

    public Triangle(Point a, Point b, Point c) throws IllegalArgumentException {
        this.sidesLength = new double[]{distance(a, b), distance(b, c), distance(a, c)};
        System.out.println(Arrays.toString(sidesLength));
        checkTriangle(a, b, c);
    }

    private void checkTriangle(Point a, Point b, Point c) throws IllegalArgumentException {
        double sum = Arrays.stream(sidesLength).sum();
        for (int i = 0; i < 3; i++) {
            if (sum - sidesLength[i] < sidesLength[i]) {
                throw new IllegalArgumentException("error");
            }
        }
        this.A = a;
        this.B = b;
        this.C = c;
    }

    private double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }

    @Override
    public double square() {
        double p = ((Arrays.stream(sidesLength).sum())/2);
        return Math.sqrt(p*(p-sidesLength[0])*(p-sidesLength[1])*(p-sidesLength[2]));
        //return p;
    }

    @Override
    public double perimeter() {
        return Arrays.stream(sidesLength).sum();
    }

    @Override
    public void move(double dx, double dy) {

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                super.toString() +
                '}';
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        this.A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        this.B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }
}
