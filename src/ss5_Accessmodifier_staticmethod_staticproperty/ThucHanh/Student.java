package ss5_Accessmodifier_staticmethod_staticproperty.ThucHanh;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT";

    //contructor
    Student (int r, String n){
        rollno=r;
        name=n;

    }
    //static method to change
    static void change(){
        college="Hieu";
    }

    // method to display
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
