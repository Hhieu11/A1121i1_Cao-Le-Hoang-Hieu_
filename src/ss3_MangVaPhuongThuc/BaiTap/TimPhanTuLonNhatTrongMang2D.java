package ss3_MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so dong ");
        int m=sc.nextInt();
        System.out.println("Nhap vao so cot");
        int n=sc.nextInt();
        int A[][]=new int[m][n];
        System.out.println("Nhap vao cac phan tu cua ma tran");

        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("A["+i+"]["+j+"] =");
                A[i][j]=sc.nextInt();
            }
        }

        int max=A[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(max<A[i][j]){
                    max=A[i][j];
                }
            }
        }
        System.out.println("so lon nhat trong mang "+max);
    }
}
