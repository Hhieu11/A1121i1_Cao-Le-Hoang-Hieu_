package ss2_VongLap.BaiTap;
import java.util.Scanner;
public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice=-1;

        Scanner sc=new Scanner(System.in);
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhap vao m");
                    int m=sc.nextInt();

                    System.out.println("Nhap vao n");
                    int n=sc.nextInt();
                    if(m>0&&n>0){
                        for(int i=1;i<=m;i++){
                            for(int j=1;j<=n;j++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }

                    }
                case 2:
                    System.out.println("Nhap vao h");
                    int h=sc.nextInt();
                    if(h>0){
                        for (int i=1;i<=h;i++){
                            for(int j=1;j<=i;j++){
                                System.out.print("*");

                            }
                            System.out.println();
                        }
                    }
                case 3:
                    System.out.println("Nhap vao b");
                    int b=sc.nextInt();
                    if(b>0){
                        for(int i=1;i<=b;i++){
                            for(int j=1;j<=b;j++){
                                if(j<=(b-1)){
                                    System.out.print("   ");
                                }
                                else{
                                    System.out.print(" * ");
                                }

                            }
                            System.out.println();
                        }

                    }
                case 0:
                    System.exit(0);

            }

        }


    }
}
