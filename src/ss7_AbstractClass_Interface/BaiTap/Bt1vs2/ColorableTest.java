package ss7_AbstractClass_Interface.BaiTap.Bt1vs2;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[]shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Square();
        shape[2] = new Rectangle();

        for (Shape shape1 : shape) {
            if (shape1 instanceof Square) {
                ((Square) shape1).howToColor();
            } else {
                System.out.println(shape1.getArea());
            }
        }
    }
}
