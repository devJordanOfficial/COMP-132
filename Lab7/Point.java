public class Point {

    public final double X;
    public final double Y;

    public Point() {
        this(0,0);
    }

    public Point(double x, double y) {
        X = x;
        Y = y;
    }

    public double distanceFrom(double x, double y) {
        return Math.sqrt((Math.pow((Math.pow(X,2) - x),2)) + (Math.pow((Math.pow(Y,2) - y),2)));
    }

    public double distanceFrom(Point point) {
        return distanceFrom(point.X, point.Y);
    }

    @Override
    public String toString() {
        return "Point: [" + X + ", " + Y + "]";
    }

}
