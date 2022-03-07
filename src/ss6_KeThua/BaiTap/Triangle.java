package ss6_KeThua.BaiTap;

import ss6_KeThua.ThucHanh.Shape;

public class Triangle extends Shape {
    private double side1=1;
    private double side2=1;
    private double side3=1;

    public Triangle (){

    }

    public  Triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }
    public  double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double a = getPerimeter() / 2;
        return Math.sqrt(a*(a-side1)*(a-side2)*(a-side3));


    }
    public String toString(){
        return "Triangle  " + side1 + ", " + side2 + ", " + side3 + "  " + super.toString();
    }
}
