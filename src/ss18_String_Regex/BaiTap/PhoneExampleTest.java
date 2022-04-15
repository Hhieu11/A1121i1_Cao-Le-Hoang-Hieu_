package ss18_String_Regex.BaiTap;

import sun.awt.Symbol;

import java.util.Scanner;

public class PhoneExampleTest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap vao so dien thoai");
        String phone=scanner.nextLine();
        PhoneExample phoneExample= new PhoneExample() ;
        boolean isValid=phoneExample.validate(phone);
        if(isValid){
            System.out.println("true");
        }
        else {
            System.out.println("sai");
        }
    }
}
