package ss3_MangVaPhuongThuc.ThucHanh;
import java.util.Scanner;


public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double doC;
        double doF;
        int choice;
        do{
            System.out.println("Nhap vao lua chon cua ban");
            System.out.println("1.doi do F sang do C");
            System.out.println("2.Doi do C sang do F");
            System.out.println("0.Thoat");
            choice=sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Nhap vao do F");
                    doF=sc.nextDouble();
                    System.out.println("doF sang doC "+dofsangdoC(doF));
                    break;

                }
                case 2:{
                    System.out.println("Nhap vao do C");
                    doC=sc.nextDouble();
                    System.out.println("doC sang doF "+doCsangdoF(doC));
                    break;
                }
                case 0:
                    System.exit(0);
            }




        }while (choice!=0);
    }
    public  static double dofsangdoC(double doC){
        double doF=(9.0 / 5) * doC + 32;
        return doF;
    }
    public static  double doCsangdoF(double doF){


         double doC=(5.0 / 9) * (doF - 32);
        return doC;
    }
}
