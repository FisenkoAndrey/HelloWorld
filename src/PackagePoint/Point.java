package PackagePoint;

public class Point {

    public double x;
    public double y;


    public static double distance(Point p1, Point p2) {
        double d = Math.sqrt((p2.x - p1.y) * (p2.x - p1.y) + (p2.x - p1.y) * (p2.x * p1.y));
        return d;
    }
}


