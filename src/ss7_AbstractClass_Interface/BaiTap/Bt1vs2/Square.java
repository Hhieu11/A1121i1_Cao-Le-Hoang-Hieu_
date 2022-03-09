package ss7_AbstractClass_Interface.BaiTap.Bt1vs2;

public class Square extends Shape implements Resizeable,Colorable {

    private  double size=2;
    public  Square(){

    }
    public  Square(double size){
        this.size=size;

    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea(){
        return size*size;
    }

    @Override
    public String howToColor() {
        return "Color all four sides";

    }

    @Override
    public void resize(double percent) {
        this.size = size + size*percent/100;
    }

    @Override
    public String display() {
        return " size = " + size;
    }
}
