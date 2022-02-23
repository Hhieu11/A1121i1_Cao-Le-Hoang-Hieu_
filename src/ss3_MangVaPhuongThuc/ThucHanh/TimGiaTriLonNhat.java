package ss3_MangVaPhuongThuc.ThucHanh;
import java.util.Scanner;


public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int[] arr;
        do{
            System.out.println("Nhap vao do dai");
            size=sc.nextInt();
            if(size>20){
            System.out.println("Nhap lai mang");}

        }while (size>20);
        arr=new int [size];
        int i=0;
        while (i<arr.length){
            System.out.println("phan tu thu "+(i+1));
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.println("danh sach mang da nhap");
        for(int j=0; j<arr.length;j++){
            System.out.println(arr[j]+"\t");
        }
        int max=arr[0];
        int index=1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
                index=j+1;

            }
        }
        System.out.println("gia tri lon nhat trong mang "+max+" Vi tri trong mang "+index);
    }
}
