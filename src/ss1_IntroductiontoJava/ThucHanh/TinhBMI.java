package ss1_IntroductiontoJava.ThucHanh;
import java.util.Scanner;

public class TinhBMI {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double canNang,chieuCao,BMI;

        System.out.println("Nhap vao can nang");
        canNang=scanner.nextDouble();

        System.out.println("Nhap cao chieu cao");
        chieuCao=scanner.nextDouble();

        BMI=canNang/Math.pow(chieuCao,2);
        if(BMI<18){
            System.out.println("BMI : "+BMI+"Underweight");
        }
        else if(BMI<25.0){
            System.out.println("BMI : "+BMI+"Normal");
        }
        else if(BMI<30.0){
            System.out.println("BMI : "+BMI+"Overweight");
        }
        else {
            System.out.println("BMI : "+BMI+"Obese");
        }


    }
}
