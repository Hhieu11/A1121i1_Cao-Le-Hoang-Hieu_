package ss1_IntroductiontoJava.BaiTap;
import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd=23000;
        double usd;
        System.out.println("Nhap so tien can quy doi");
        usd=sc.nextDouble();
        double quydoi=vnd*usd;
        System.out.println("So tien la : "+quydoi+" d");

    }
}

