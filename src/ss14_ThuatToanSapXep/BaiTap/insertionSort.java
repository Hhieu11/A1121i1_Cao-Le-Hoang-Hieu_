package ss14_ThuatToanSapXep.BaiTap;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={2,5,365,23,-1};
        soft(arr);
        System.out.println(Arrays.toString(arr));
    }
    public  static  void  soft(int [] myArr){
        for(int i=1;i<myArr.length;i++){
            int curent=myArr[i];
            int k=i-1;

            for(;k>=0&&myArr[k]>curent;k--){
                myArr[k+1]=myArr[k];
            }
            myArr[k+1]=curent;
        }

    }
}
