package CaseStudy2.models;

public class Villa extends Facility{

    private String roomStandard;
    private int numberOfFloors;
    private  int poolArea;
    public Villa(){}

    public Villa(String name,double price,String rentalType,
                 String usableArea,String roomStandard,int numberOfFloors,int poolArea ){
        super(name, price, rentalType, usableArea);
        this.roomStandard=roomStandard;
        this.numberOfFloors=numberOfFloors;
        this.poolArea=poolArea;
    }
    public Villa(String roomStandard,int numberOfFloors, int poolArea){
        this.poolArea=poolArea;
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

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }
}
