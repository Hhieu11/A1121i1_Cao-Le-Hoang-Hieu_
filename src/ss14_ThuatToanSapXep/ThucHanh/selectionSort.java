package ss14_ThuatToanSapXep.ThucHanh;

import java.util.Arrays;

public class selectionSort {

    public static void sort(int [] myArr){
        for(int i=0;i<myArr.length-1;i++){
            int minValue=myArr[i];
            int minIndex=i;
            for(int j=i;j<myArr.length;j++){
                if(minValue>myArr[j]){
                    minValue=myArr[j];
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int temp=myArr[i];
                myArr[i]=minValue;
                myArr[minIndex]=temp;


            }
        }

    }
    public static void main(String[] args) {
        int []arr={2,-1,3,8,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
