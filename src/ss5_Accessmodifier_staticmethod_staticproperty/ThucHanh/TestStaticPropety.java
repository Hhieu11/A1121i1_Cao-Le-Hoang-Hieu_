package ss5_Accessmodifier_staticmethod_staticproperty.ThucHanh;

public class TestStaticPropety {
    public static void main(String[] args) {
        Car car1=new Car("Camaro","Num3");
        System.out.println(Car.getNumberOfCar());
        Car car2=new Car("Mustang","Num2");
        System.out.println(Car.getNumberOfCar());

    }
}
