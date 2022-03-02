package ss6_KeThua.BaiTap;

public class Cylinder extends Circle {
    private double hight=4;
    public Cylinder(){}

    public Cylinder(double  hight){
        this.hight=hight;
    }
    public Cylinder(double radius,String color,double hight){
        super(radius,color);
        this.hight=hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    public double theTich(){
        return Math.PI*(getRadius()*getRadius())*hight;
    }
    public String toString(){
        return "Height :"+hight+" V :"+theTich()+super.toString();
    }
}
