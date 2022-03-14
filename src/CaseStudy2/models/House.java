package CaseStudy2.models;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public  House(){}

    public House(String name,double price,String rentalType,
                 String usableArea,String roomStandard,int numberOfFloors){
        super(name, price, rentalType, usableArea);
        this.numberOfFloors=numberOfFloors;
        this.roomStandard=roomStandard;
    }

    public House(String roomStandard,int numberOfFloors){
        this.numberOfFloors=numberOfFloors;
        this.roomStandard=roomStandard;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
