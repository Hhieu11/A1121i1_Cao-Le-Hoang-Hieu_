package ss5_Accessmodifier_staticmethod_staticproperty.ThucHanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();//goi method

        Student s1=new Student(111,"Hieu");
        Student s2=new Student(222,"Hieu2");
        Student s3=new Student(333,"Hieu3");

        s1.display();
        s2.display();
        s3.display();
    }
}
