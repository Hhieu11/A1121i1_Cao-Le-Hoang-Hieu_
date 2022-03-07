package ss7_AbstractClass_Interface.ThucHanh.Bt2;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0]=new ComparableCircle(3.6);
        circles[1]= new ComparableCircle();
        circles[2]=new ComparableCircle(5.6,"red",true);
        System.out.println("pre_sorted");

        for(ComparableCircle circle:circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted:");
        for(ComparableCircle circle:circles){
            System.out.println(circle);
        }
    }
}
