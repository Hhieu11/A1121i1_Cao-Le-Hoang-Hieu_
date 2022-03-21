package CaseStudy2.Service.Impl;

import CaseStudy2.Service.EmloyeeService;
import CaseStudy2.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmloyeeService {
    private static List<Employee> employeeList= new ArrayList<>();
    private static Scanner scanner=new Scanner(System.in);
    @Override
    public void display() {
        for(Employee employee:employeeList){
            System.out.println(employee.toString());
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
        System.out.println("Nhap chức vụ");
        String level=scanner.nextLine();
        System.out.println("Nhập lương");
        String salary=scanner.nextLine();
        System.out.println("Nhập vị trí");
        String position=scanner.nextLine();

        Employee employee=new Employee( id, name,age,address, idCard,
        email, level, salary, position);

        employeeList.add(employee);



    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
