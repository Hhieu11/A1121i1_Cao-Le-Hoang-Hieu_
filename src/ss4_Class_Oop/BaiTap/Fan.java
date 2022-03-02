package ss4_Class_Oop.BaiTap;

public class Fan {
    public final int slow = 1;
    public final int medium = 2;
    public final int fast = 3;

    private int speed = this.slow;
    private boolean on = false;
    private double rad = 5;
    private String color = "Blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double radius) {
        this.rad = rad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Fan() {

    }

    public String toString() {
        if (on) return "Quat dang Bat \n Toc Do: " + getSpeed() + "\n Mau: " + getColor() + "\n " +
                "Ban kinh: " + getRad();
        else return "Quat dang tat \n Mau: " + getColor() + "\n Ban kinh: " + getRad();


    }
}
