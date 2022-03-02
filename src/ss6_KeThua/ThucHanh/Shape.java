package ss6_KeThua.ThucHanh;

public class Shape {
    private String color="Green";
    private boolean filler=true;

    Shape(){}
    public Shape(String color, boolean filler){
        this.color=color;
        this.filler=filler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }
    @Override
    public String toString(){
        return "A Shape co mau"
                +getColor()
                +" and "+(isFiller()?"filler":"not filler");

    }
}
