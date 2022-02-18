package ss1_IntroductiontoJava.ThucHanh;
import java.util.Scanner;


public class Tinhsongay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap vao thang can kiem tra");

        int thang= scanner.nextInt();

        switch (thang){
            case 2:
                System.out.println("Thang co 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 11:
                System.out.println("Thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 10:
            case 12:
                System.out.println("Thang co 30 ngay");
                break;
            default:
                System.out.println("Nhap sai ");
                break;
        }

    }



}
