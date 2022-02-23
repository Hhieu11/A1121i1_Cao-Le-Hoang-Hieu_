package ss3_MangVaPhuongThuc.ThucHanh;
import java.util.Scanner;
import java.util.ArrayList;


public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Nhap vao do dai Mang");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Nhap lai Mang");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Phan tu thu " + (i + 1));
            arr[i] = sc.nextInt();
            i++;

        }
        System.out.println("mang vua nhap ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + "\t");
        }
        int index = minValue(arr);
        System.out.println("So nho nhat trong Mang: " + arr[index]);


    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
