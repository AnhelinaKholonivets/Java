public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape shape = new Rectangle(new Point(3,4),new Point(7,6));
        Triangle triangle = new Triangle(new Point(2, 2), new Point(5,4), new Point(1, 8));
        System.out.println(shape);
        System.out.println(triangle);
    }
}
