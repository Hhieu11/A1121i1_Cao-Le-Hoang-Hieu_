package ss4_Class_Oop.ThucHanh;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so A");
        double a = sc.nextDouble();
        System.out.println("Nhap vao so B");
        double b = sc.nextDouble();
        System.out.println("Nhap vao so C");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Ban vua nhap " + quadraticEquation.display());
        double x1;
        double x2;
        if (quadraticEquation.getDiscriminant() > 0) {
            x1 = (float) ((-b + Math.sqrt(quadraticEquation.getDiscriminant())) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(quadraticEquation.getDiscriminant())) / (2 * a));
            System.out.println("phuong trinh co 2 nghiem la " + "X1= " + x1 + " X2 = " + x2);
        } else if (quadraticEquation.getDiscriminant() == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep la X1, X2 =" + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }

    }
}
