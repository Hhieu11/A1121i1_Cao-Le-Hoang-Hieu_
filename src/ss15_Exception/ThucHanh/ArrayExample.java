package ss15_Exception.ThucHanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample= new ArrayExample();
        Integer []arr= arrayExample.integers();
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap vao so bat ki");
        int x=scanner.nextInt();
        try {
            System.out.println("gia tri phan tu có index 5" + x +" la "+arr[x]);

        }
        catch (IndexOutOfBoundsException e){
            System.out.println("vuot qua so cho phep");
        }



    }
    public Integer[] integers(){
        Random random= new Random();
        Integer[] arr= new Integer[100];
        System.out.println("danh sach phan tu cua mang");
        for(int i=0; i<100;i++){
            arr[i]=random.nextInt(100);
            System.out.println(arr[i]+" ");
        }
        return arr;

    }
}
