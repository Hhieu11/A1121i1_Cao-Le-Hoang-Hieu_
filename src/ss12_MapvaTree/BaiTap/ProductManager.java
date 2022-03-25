package ss12_MapvaTree.BaiTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        ProductManager productManager= new ProductManager();
        Scanner scanner= new Scanner(System.in);
        List<Product>products= new ArrayList<>();
        products.add(new Product(1,"tivi",2300000));
        products.add(new Product(2,"May Quat",3300000));
        products.add(new Product(3,"Dien Thoai",4300000));
        products.add(new Product(4,"Laptop",5300000));
//      productManager.add(products);
//      productManager.display(products);

        System.out.println("nhap phan tu muon xoa");
        int index=scanner.nextInt();

      productManager.remove(products,index);
        productManager.display(products);


        System.out.println("Nhap phan tu muon sua");

        productManager.edit(products,index);
        productManager.display(products);




    }
    public void add(List<Product> products){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap vao id");
        int id=Integer.parseInt(scanner.nextLine()) ;
        System.out.println("Nhap vao ten");
        String name=scanner.nextLine();
        System.out.println("Nhap vao gia");
        double gia=scanner.nextDouble();

        Product product=new Product(id,name,gia);
        products.add(product);
    }
    public void display(List<Product> products){
        for (Product p:products ) {
            System.out.println(p);


        }
    }
    public  void remove(List<Product> products, int i){
        for (int j = 0; j < products.size(); j++) {
            if(products.get(j).getId()==i){
                products.remove(j);
                break;
            }

        }

    }
    public void edit(List<Product>products,int i){
        for (int j = 0; j <products.size() ; j++) {
            if(products.get(j).getId()==i){
                Scanner scanner= new Scanner(System.in);
                System.out.println("Nhap vao id");
                int id=scanner.nextInt();
                System.out.println("Nhap vao ten");
                String name=scanner.nextLine();
                System.out.println("Nhap vao gia");
                double gia=scanner.nextDouble();

                products.get(j).setId(id);
                products.get(j).setName(name);
                products.get(j).getGia(gia);
                break;

            }

        }
    }
}
