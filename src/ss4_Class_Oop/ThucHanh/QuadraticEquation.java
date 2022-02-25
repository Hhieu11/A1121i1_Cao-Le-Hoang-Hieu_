package ss4_Class_Oop.ThucHanh;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(){}
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;

    }
    public double getC(){
        return this.c;
    }
    public String display(){
        return "Ban vua nhap : "+" A= "+a+" B= "+b+"C= "+c;
    }
    public double getDiscriminant(){
        return ((this.b*2)-4*(this.a*this.c));
    }
}
