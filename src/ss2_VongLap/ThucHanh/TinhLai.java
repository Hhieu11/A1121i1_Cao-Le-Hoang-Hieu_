package ss2_VongLap.ThucHanh;
import java.util.Scanner;

public class TinhLai {
    public static void main(String[] args) {
        int thang=1;
        double laiSuat=1.0;
        double tien=1.0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Nhap vao tien ");
        tien=sc.nextDouble();

        System.out.println("Nhap vao thang");
        thang=sc.nextInt();

        System.out.println("Nhap vao ti le lai suat");
        laiSuat=sc.nextDouble();

        double tonglai=0;
        for(int i=0; i<thang;i++);
        {
            tonglai+=tien*(laiSuat/100)/12*thang;
        }
        System.out.println("tong tien "+tonglai);
    }
}
