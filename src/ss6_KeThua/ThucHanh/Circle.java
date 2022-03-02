package ss6_KeThua.ThucHanh;

public class Circle extends Shape {
    private double radius=1;
    public Circle(){}

    public Circle(double radius){
        this.radius=radius;
    }

//    public Circle(double i, String red, boolean b) {
public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
}
//    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public String toString(){
        return "radius : "
                +getRadius()
                +"Which is a subclass of"
                +super.toString();
    }

}
