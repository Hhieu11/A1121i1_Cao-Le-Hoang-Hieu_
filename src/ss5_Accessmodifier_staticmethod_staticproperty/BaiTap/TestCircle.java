package ss5_Accessmodifier_staticmethod_staticproperty.BaiTap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        Circle circle2=new Circle(5);

        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());

        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
    }
}
