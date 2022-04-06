package ss17_IOFileBnary.BaiTap;

import java.util.Scanner;

public class mainProduct {
    public static void main(String[] args) {
        TestProduct testProduct= new TestProduct();

        boolean check=true;
        while (check){
            Scanner scanner= new Scanner(System.in);
            System.out.println("Nhập 1 để add");
            System.out.println("Nhap 2 để lưu");
            System.out.println("Nhap 3 để tim kiếm");
            switch (scanner.nextInt()) {
                case 1: {
                    testProduct.add();
                    break;

                }
                case 2:{
                    testProduct.display();
                    break;
                }
            }
        }





    }

}
