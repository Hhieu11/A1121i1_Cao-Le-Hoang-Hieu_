package ss2_VongLap.BaiTap;
import java.util.Scanner;

public class HienThiSoNT100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dem=0;
        int m=2;

        int n=100;
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


    }

