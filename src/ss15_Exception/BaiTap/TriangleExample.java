package ss15_Exception.BaiTap;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) throws IllegalTriangleException {
        TriangleExample triangleExample= new TriangleExample();
        Scanner scanner= new Scanner(System.in);
        try {
            System.out.println("Nhap vao a");
            int a = scanner.nextInt();
            System.out.println("Nhap vao b");
            int b = scanner.nextInt();

            System.out.println("Nhap vao c");
            int c = scanner.nextInt();

            try {
                triangleExample.triangle(a,b,c);
            }
            catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
            }


        }catch (Exception e){
            System.out.println("Nhap sai, Nhap 3 cạnh không được âm");
        }
        scanner.close();




    }
    private static void triangle(int a,int b,int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }


    }
}
