package ss4_Class_Oop.ThucHanh;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao chieu dai");
        double chieuDai=sc.nextDouble();
        System.out.println("Nhap vao chieu rong");
        double chieuRong=sc.nextDouble();

        Rectangle rectangle=new Rectangle(chieuDai,chieuRong);
        System.out.println("Ban vua nhap "+rectangle.display());
        System.out.println("Dien tich "+rectangle.getDienTich());
        System.out.println("Chu vi "+rectangle.getChuVi());


    }
}
