public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        Point3D point3D1 = new Point3D();
        point3D1.setX(2);
        point3D1.setY(4);
        point3D1.setZ(7);
        System.out.println(point3D1);

        Point3D point3D2 = new Point3D();
        point3D2.setXYZ(3,1, 3);
        System.out.println(point3D2);
    }
}
