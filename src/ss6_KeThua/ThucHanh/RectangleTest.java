package ss6_KeThua.ThucHanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);

        rectangle=new Rectangle(3,2);
        System.out.println(rectangle);

        rectangle=new Rectangle(4,5,"red",true);
        System.out.println(rectangle.toString());
    }
}
