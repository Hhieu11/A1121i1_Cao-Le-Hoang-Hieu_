package ss6_KeThua.BaiTap;

import java.util.Arrays;

public class Test2D {
    public static void main(String[] args) {
        Point2D point2D=new Point2D();
        System.out.println(point2D);

        Point2D point2D1=new Point2D(2,3);
        System.out.println(point2D);

        System.out.println(Arrays.toString(point2D1.getXY()));
        System.out.println(point2D1.toString());
    }

}
