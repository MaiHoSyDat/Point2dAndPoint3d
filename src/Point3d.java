import java.util.Arrays;

public class Point3d extends Point2d {
    private float z = 0.0f;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3d(float z) {
        this.z = z;
    }

    public float getZ() {

        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = {this.z, this.getX(), this.getY()};
        return array;
    }

    public static void main(String[] args) {
        Point3d point3d = new Point3d();
        System.out.println(Arrays.toString(point3d.getXYZ()));
    }
}
