package CaseStudy2.models;

public class Room extends Facility {

    private String freeService;

    public  Room(){}

    public Room(String name,double price,String rentalType,
                String usableArea,String freeService){
        super(name, price, rentalType, usableArea);
        this.freeService=freeService;
    }
    public  Room(String freeService){
        this.freeService=freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
