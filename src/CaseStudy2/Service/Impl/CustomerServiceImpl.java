package CaseStudy2.Service.Impl;

import CaseStudy2.Service.CustomerService;
import CaseStudy2.models.Customer;
import CaseStudy2.models.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    private static List<Customer> customerList= new LinkedList<>();
    private Scanner scanner= new Scanner(System.in);





    @Override
    public void display() {
        for (Customer customer: customerList){
            System.out.println(customer.toString());
        }

    }

    @Override
    public void addNew() {
        System.out.println("Nhập id");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name=scanner.nextLine();
        System.out.println("nhập tuổi");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ");
        String address=scanner.nextLine();
        System.out.println("Nhập CMND");
        int idCard=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Email");
        String email=scanner.nextLine();
        System.out.println("Loại khách hàng");
        String type=scanner.nextLine();

        Customer customer=new Customer (id,name, age, address, idCard,
         email,type);
        customerList.add(customer);
        System.out.println("thêm thành công");

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
