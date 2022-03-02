package ss5_Accessmodifier_staticmethod_staticproperty.BaiTap;

public class Circle {
    private double radius=1;
    private String colow="Green";

    Circle(){

    }
    Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return  radius*radius*Math.PI;
    }
}
