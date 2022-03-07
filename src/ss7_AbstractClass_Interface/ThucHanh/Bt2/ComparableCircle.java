package ss7_AbstractClass_Interface.ThucHanh.Bt2;

import ss6_KeThua.ThucHanh.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

     public  ComparableCircle(){}
     public ComparableCircle(double radius){
         super(radius);
     }
     public ComparableCircle(double radius, String color, boolean filled){
         super(radius, color, filled);
     }

    @Override
    public int compareTo(ComparableCircle com) {
         if(getRadius()>com.getRadius()) return 1;
         else if (getRadius()<com.getRadius()) return -1;
          else return 1;
    }
}
