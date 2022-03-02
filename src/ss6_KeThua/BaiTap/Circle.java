package ss6_KeThua.BaiTap;

public class Circle {
    private double radius=1;
    private String color="red";

    public Circle(){

    }
    public Circle(double radius,String color){
        this.color=color;
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius*radius+Math.PI;
    }

    public String toString(){
        return "Co ban kinh = "+getRadius()+" Co mau "+getColor()+" Co dien tich "+getArea();
    }
}
