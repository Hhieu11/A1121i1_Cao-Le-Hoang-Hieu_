package ss14_ThuatToanSapXep.ThucHanh;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]={1,3,5,2,9,5,7,8,3,10};
        a=soft(a);

        System.out.println(Arrays.toString(a));
    }
    public static int[] soft (int[] myarr){
        boolean check=true;
        for(int i =1;i<myarr.length && check;i++){
            check=false;
            for(int j=0;j<myarr.length-1;j++){
                if(myarr[j]>myarr[j+1]){
                    int temp=myarr[j];
                    myarr[j]=myarr[j+1];
                    myarr[j+1]=temp;

                    check=true;
                }
            }
        }
        return  myarr;

    }
}
