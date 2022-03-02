package ss4_Class_Oop.BaiTap;

public class MainFan {

    public static void main(String[] args) {
        Fan fan1=new Fan();
        Fan fan2=new Fan();

        fan1.setSpeed(fan1.fast);
        fan1.setRad(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        fan2.setSpeed(fan1.medium);
        fan2.setRad(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}
