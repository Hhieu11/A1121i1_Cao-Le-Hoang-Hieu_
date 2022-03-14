package CaseStudy2.models;

public abstract class Facility {
    private String name;
    private double price;
    private String rentalType;
    private String usableArea;


    public Facility(){}

    public Facility(String name,double price,String rentalType,String usableArea){
        this.name=name;
        this.price=price;
        this.rentalType=rentalType;
        this.usableArea=usableArea;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
