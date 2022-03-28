package ss14_ThuatToanSapXep.ThucHanh;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao size");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + "value :");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println("mang vua nhap la");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "/t");
        }
        System.out.println(" \\nBegin sort processing...");
        BubbleSortByStep(list);
    }


    public static void BubbleSortByStep(int[] list) {
        boolean check = true;
        for (int k = 1; k < list.length && check; k++) {
            check = false;
            for (int j = 0; j < list.length - k; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("Swap " + list[j] + "with " + list[j + 1]);
                    int tempp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tempp;

                    check = true;

                }
            }
            if (check == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;


            }

            System.out.println("List after the  " + k + "' sort: ");
            for(int i=0;i<list.length;i++ ){
                System.out.println(list[i]+"\t");
            }
            System.out.println();




        }
    }
}

