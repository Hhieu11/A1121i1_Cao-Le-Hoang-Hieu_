package ss15_Exception.ThucHanh;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {

        CalculationExample calculationExample= new CalculationExample();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập vao x");
        int x=scanner.nextInt();
        System.out.println("Nhap vao số y");
        int y=scanner.nextInt();
        calculationExample.caculation(x,y);

    }
    private void caculation(int x, int y){
        try{
            int a= x+y;
            int b=x-y;
            int c=x*y;
            int d=x/y;
            System.out.println("x+y= "+a);
            System.out.println("x-y= "+b);
            System.out.println("x*y= "+c);
            System.out.println("x/y= "+d);
        }
        catch (NumberFormatException e){
            System.out.println("có lỗi "+e.getMessage());
        }
    }

}

