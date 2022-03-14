package CaseStudy2.models;

public class Customer extends Person {
    private String type;

    public Customer(){
    }

    public Customer(int id,String name, int age,String address,int idCard,
                    String email,String type){
        super(id, name, age, address, idCard, email);
        this.type=type;
    }

    public Customer(String type){
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
