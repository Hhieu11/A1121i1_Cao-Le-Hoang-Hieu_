package ss4_Class_Oop.ThucHanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Rectangle {
    double chieuDai,chieuRong;

    public Rectangle(){

    }
    public Rectangle(double chieuDai,double chieuRong){
        this.chieuDai=chieuDai;
        this.chieuRong=chieuRong;

    }
    public double getDienTich(){
        return this.chieuDai*this.chieuRong;

    }
    public double getChuVi(){
        return (this.chieuDai+this.chieuRong)*2;

    }
    public String display(){
        return "Rectangle "+ " Chieu Dai= "+chieuDai+" Chieu Rong = "+chieuRong;
    }
}
