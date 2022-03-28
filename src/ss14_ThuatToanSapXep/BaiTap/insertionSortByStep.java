package ss14_ThuatToanSapXep.BaiTap;

import java.util.Scanner;

public class insertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap vao size");
        int size=scanner.nextInt();
        int [] list=new int[size];
        System.out.println("Enter "+list.length+" Value");
        for(int i=0;i<list.length;i++){
            list[i]=scanner.nextInt();
        }
        System.out.println("Mang vua nhap la");
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]+"\t");
        }

    }

    public static  void  SnsertionSortByStep(int [] list){
        


    }
}
