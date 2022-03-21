package ss11.DSA_Stack_Queue.BaiTap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapString {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        String str="hieu Vip BrO";
        String[]arrStr=str.split(" ");
        System.out.println(Arrays.toString(arrStr));

        for(int i=0;i<arrStr.length;i++){
            String arrKey=arrStr[i].toUpperCase();
            System.out.println(arrKey);

            if(map.containsKey(arrKey)){
                System.out.println("1"+arrKey);
                //day key vao map xong tăng lên 1
                map.put(arrKey,map.get(arrKey)+1);
            }
            else{
                System.out.println("2"+arrKey);
                map.put(arrKey,1);


            }
        }
        System.out.println(map.toString());


    }
}
