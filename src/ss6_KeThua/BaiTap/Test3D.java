package ss6_KeThua.BaiTap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test3D {
    public static void main(String[] args) {
        Point3D point3D=new Point3D();
        System.out.println(point3D);

        Point3D point3D1= new Point3D(3,4,6);
        System.out.println(point3D1);
        System.out.println(Arrays.toString(point3D1.getXYZ()));
        System.out.println(point3D1.toString());
    }
}
