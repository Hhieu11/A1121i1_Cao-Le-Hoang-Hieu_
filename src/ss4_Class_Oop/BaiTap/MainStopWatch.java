package ss4_Class_Oop.BaiTap;

import java.util.Scanner;
import java.util.Date;
import java.util.Arrays;

public class MainStopWatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StopWatch stopWatch=new StopWatch();
        int[] arr1= {1,123,1234,111,12};
//        int[] arr2 = new int[arr1.length];

        Date start = stopWatch.getStartTime();
        System.out.println(start);

        for(int i = 0; i<arr1.length-1;i++) {
            int index = i;
            for(int j =i+1;j<arr1.length;j++) {
                if (arr1[j] < arr1[index]) index = j;
            }
            int temp = arr1[i];
            arr1[i] = arr1[index];
            arr1[index] = temp;
        }
        System.out.println("Mang : " + Arrays.toString(arr1));

        Date end = stopWatch.getEndTime();
        System.out.println(end);
        System.out.println("Thoi gian troi qua :" + stopWatch.getElapsedTime(start,end));

    }
}
