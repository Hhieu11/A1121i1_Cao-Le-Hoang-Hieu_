package ss3_MangVaPhuongThuc.ThucHanh;
import java.util.Scanner;

public class DaoNguoc {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc=new Scanner(System.in);
        do{

            System.out.println("Nhap vao do dai");
            size=sc.nextInt();
            if(size>20){
                System.out.println("Nhap lai do dai");
            }
        }
        while (size>20);
            arr=new int[size];
            int i=0;
            while (i<arr.length){
                System.out.println("nhap phan tu thu "+(i+1)+":");
                arr[i]=sc.nextInt();
                i++;
            }
        System.out.println("Cac phan tu cua mang: " );
            for(int j=0; i<arr.length;j++){
                System.out.println(arr[i]+"\t");
            }
            for(int j=0;j<arr.length/2;j++){
                int temp=arr[j];
                arr[j]=arr[size-1-j];
                arr[size-1-j]=temp;
            }
        System.out.println("Mang dao nguoc :");
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[j]+"\t ");
            }


        
    }
}

