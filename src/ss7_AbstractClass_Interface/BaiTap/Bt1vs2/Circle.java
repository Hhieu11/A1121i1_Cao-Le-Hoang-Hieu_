package ss7_AbstractClass_Interface.BaiTap.Bt1vs2;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.radius = radius + radius*percent/100;


    }

    @Override
    public String display() {
        return "Radius "+radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}


