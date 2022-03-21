package CaseStudy2.controllers;

import CaseStudy2.Service.Impl.CustomerServiceImpl;
import CaseStudy2.Service.Impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
        Scanner scanner = new Scanner(System.in);
//        returnMenu(scanner);
    }
//    public static void returnMenu(Scanner scanner){
//        int choice=-1;
//
//        System.out.println("1.Employee Management");
//        System.out.println("2.Customer Management");
//        System.out.println("3.Facility Management ");
//        System.out.println("4.Booking Managerment");
//        System.out.println("5.Promotion Management");
//        System.out.println("6.Exit");
//        while (choice!=6){
//            choice=scanner.nextInt();
//            displayMainMenu(choice);
//        }
//
//    }

    public static void displayMainMenu() {
        boolean check = true;

         while (check) {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Managerment");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {
                    displayEmployeeMenu();
                    break;

                }
                case 2: {
                    displayCustomerMenu();
                    break;
                }
                case 3: {
                    displayFacilityMenu();
                }
                case 4: {
                    displayBookingMenu();
                }
                case 5: {
                    displayPromotionMenu();
                }
                case 6:{
                    System.exit(0);
                }

            }
      }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService= new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee ");
            System.out.println("4.Return main menu");


            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {
                    employeeService.display();
                    break;

                }
                case 2:{
                    employeeService.addNew();
                    break;
                }
                case 4:{
//                    returnMenu(scanner);
                }
            }
        }


    }

    public static void displayCustomerMenu() {
        CustomerServiceImpl customerService= new CustomerServiceImpl();

        boolean check = true;
        while (check) {
            System.out.println("1.Display list Customer");
            System.out.println("2.Add new Customer");
            System.out.println("3.Edit Customer ");
            System.out.println("4.Return main menu");


            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {
                    customerService.display();
                    break;

                }
                case 2:{
                    customerService.addNew();
                    break;
                }
                case 4:{
//                    returnMenu(scanner);
                }
            }
        }


    }

    public static void displayFacilityMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1.Display list Facility");
            System.out.println("2.Add new Facility");
            System.out.println("3.Edit Facility ");
            System.out.println("4.Return main menu");


            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {

                }
                case 4:{
//                    returnMenu(scanner);
                }
            }
        }


    }

    public static void displayBookingMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Create new constracts ");
            System.out.println("4.Display list contracts");
            System.out.println("5.Edit contracts");
            System.out.println("6.Return main menu");


            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {

                }
                case 6:{
//                    returnMenu(scanner);
                }
            }
        }


    }

    public static void displayPromotionMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1.Display list customers use service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3.Return main menu ");


            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {

                }
                case 3:{
//                    returnMenu(scanner);
                }



            }
        }


    }

}
