package ss13_Thuat_toan_tim_kiem.BaiTap;

import java.util.LinkedList;
import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap vao chuoi : ");
        String string= scanner.nextLine();

        LinkedList<java.lang.Character> max=new LinkedList<>();
        for(int i=0; i<string.length();i++){
            LinkedList<java.lang.Character> list=new LinkedList<>();
            list.add(string.charAt(i));

            for(int j=i+1; j<string.length();i++){
                if(string.charAt(j)>list.getLast()){
                    list.add(string.charAt(j));
                }
            }

            if(list.size()>max.size()){
                max.clear();
                max.addAll(list);

            }
            list.clear();


        }

//
//        for (Character ch : max){
//            System.out.println(ch);
//
//
//        }
//        System.out.println();
    }
}
