package ss2_VongLap.ThucHanh;
import java.util.Scanner;


public class KiemTraSNT {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap vao so");
        int num=sc.nextInt();
        if(num<2){
            System.out.println("Khong phai so nguyen to");
        }
        else {
            boolean soNT=true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    soNT=false;

                }
            }
            if(soNT){
                System.out.println(num+ "La so nguyen to");
            }
            else{
                System.out.println(num+"Khong la so nguyen to");
            }

        }


    }
}
