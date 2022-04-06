package ss18_String_Regex.BaiTap;

import java.util.Scanner;

public class ClassExampleTest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap tên class");
        String nameClass= scanner.nextLine();

        ClassExample classExample= new ClassExample();

        boolean isValid= classExample.validate(nameClass);
        if(isValid){
            System.out.println("sức sét");
        }
        else {
            System.out.println("ô nô");
        }

    }

}
