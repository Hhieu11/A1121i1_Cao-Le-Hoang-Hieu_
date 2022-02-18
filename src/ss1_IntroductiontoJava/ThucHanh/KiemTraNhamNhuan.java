package ss1_IntroductiontoJava.ThucHanh;
import java.util.Scanner;

public class KiemTraNhamNhuan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year= scanner.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Nam nhuan"+year);
                }
                else {
                    System.out.println("Nam khong nhuan"+ year);
                }

            }
            else{
                System.out.println("Nam nhuan "+year);
            }

        }
        else {
            System.out.println("Nam khong nhuan "+ year);
        }
    }
}
