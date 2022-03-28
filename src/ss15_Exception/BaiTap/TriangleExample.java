package ss15_Exception.BaiTap;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) throws IllegalTriangleException {
        TriangleExample triangleExample= new TriangleExample();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap vao x");
        int x=scanner.nextInt();
        System.out.println("Nhap vao y");
        int y=scanner.nextInt();

        System.out.println("Nhap vao z");
        int z=scanner.nextInt();
        triangleExample.triangle(x,y,z);



    }
    private static void triangle(int x,int y,int z) throws IllegalTriangleException {
        try{
            if(x<y+z&&y<x+z&&z<x+y){
                System.out.println("Ba canh la tam giac");
            }
        }catch (Exception e){
            System.out.println("loi"+e.getMessage());
        }


    }
}
