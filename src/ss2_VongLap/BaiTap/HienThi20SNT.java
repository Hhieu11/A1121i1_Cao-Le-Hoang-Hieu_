package ss2_VongLap.BaiTap;
import java.util.Scanner;

public class HienThi20SNT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so N");
        int n=sc.nextInt();
        if(n>0){
            int dem=0;
            int m=2;
            while (dem<n){

                boolean nguyento=true;
                for(int i=2;i<=Math.sqrt(m);i++){
                    if(m%i==0){
                        nguyento=false;
                        break;
                    }


                }
                if(nguyento){
                    System.out.println(m+" ");
                    dem++;
                }
                m++;
            }


        }
        else{
            System.out.println("Nhap lai N");
        }
    }
}
