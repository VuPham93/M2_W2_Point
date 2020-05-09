public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        Point2D point2D1 = new Point2D();
        point2D1.setX(2);
        point2D1.setY(4);
        System.out.println(point2D1);

        Point2D point2D2 = new Point2D();
        point2D2.setXY(3,1);
        System.out.println(point2D2);
    }
}
