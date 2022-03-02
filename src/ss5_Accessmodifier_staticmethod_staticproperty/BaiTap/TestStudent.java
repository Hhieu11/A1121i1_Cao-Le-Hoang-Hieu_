package ss5_Accessmodifier_staticmethod_staticproperty.BaiTap;

public class TestStudent {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Hieu");
        student.setClasses("A11");

        System.out.println("Name "+student.getName()+" Class "+student.getClasses());



    }
}
