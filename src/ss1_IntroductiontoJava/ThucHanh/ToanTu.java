package ss1_IntroductiontoJava.ThucHanh;
import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float chieuRong;
        float chieuDai;
        Scanner scanner=new Scanner(System.in);//Khai bao doi tuong
        System.out.println("Nhap cao chieu rong");
        chieuRong=scanner.nextFloat();

        System.out.println("Nhap vao chieu dai");
        chieuDai=scanner.nextFloat();

        float dienTich=chieuDai*chieuRong;
        System.out.println("Dien tich = "+ dienTich);

    }
}
