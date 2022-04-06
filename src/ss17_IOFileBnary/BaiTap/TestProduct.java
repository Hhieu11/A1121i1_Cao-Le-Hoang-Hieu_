package ss17_IOFileBnary.BaiTap;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestProduct {
    static Scanner scanner= new Scanner(System.in);
    static List<Product>productList= new ArrayList<>();


    public static void add(){
        System.out.println("Nhap vao id");
        int codeId=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao tên");
        String name= scanner.nextLine();
        System.out.println("nhap vao hãng");
        String manufacturer=scanner.nextLine();
        System.out.println("Nhap vao giá");
        double price=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao mô tả");
        String description=scanner.nextLine();

        Product product= new Product(codeId,name,manufacturer,price,description);
        productList.add(product);
        ReadAndWriteFile.write(productList,"Product.txt");
    }
    public static void display(){
        productList= (List<Product>) ReadAndWriteFile.readFile("D:\\laptrinhcodegym\\Module_2\\Product.txt");

        for(Product o:productList){
            System.out.println(o.toString());
        }

    }

}
