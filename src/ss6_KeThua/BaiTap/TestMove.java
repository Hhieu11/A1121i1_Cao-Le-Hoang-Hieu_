package ss6_KeThua.BaiTap;

public class TestMove {
    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint();
        System.out.println(moveablePoint.move());

        MoveablePoint moveablePoint1=new MoveablePoint(3.4f,1,3,5f);

        System.out.println(moveablePoint1.move());



    }
}
