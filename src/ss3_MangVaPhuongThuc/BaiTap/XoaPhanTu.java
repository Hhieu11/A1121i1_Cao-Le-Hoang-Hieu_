package ss3_MangVaPhuongThuc.BaiTap;
import java.util.Scanner;
import java.util.ArrayList;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int []arr;
        do{
            System.out.println("Nhap vao do dai mang");
            size=sc.nextInt();
            if(size>10){
                System.out.println("Nhap lai Mang ");

            }
        }while (size>20);
        arr=new int[size];
        int i=0;
        while (i<arr.length){
            System.out.println("Phan tu thu "+(i+1));
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.println("Mang vua nhap la");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }

    }
}
