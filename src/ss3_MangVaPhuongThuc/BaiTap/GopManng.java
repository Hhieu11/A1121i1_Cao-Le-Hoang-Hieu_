package ss3_MangVaPhuongThuc.BaiTap;
import java.util.Arrays;

public class GopManng {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int length = array1.length + array2.length;

        int[] result = new int[length];
        int dem = 0;

        for (int element : array1) {
            result[dem] = element;
            dem++;
        }

        for (int element : array2) {
            result[dem] = element;
            dem++;
        }

        System.out.println(Arrays.toString(result));


    }
}
