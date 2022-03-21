package ss12_MapvaTree.ThucHanh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student("Nam",21,"Da Nang");
        Student student1= new Student("Hieu",22,"Quảng Ngãi");
        Student student2= new Student("Lion Pepsi",33,"My Dinh");

        Map<Integer, Student> studentMap=new HashMap<>();
        studentMap.put(1,student);
        studentMap.put(2,student1);
        studentMap.put(3,student2);
        studentMap.put(4,student);
        for(Map.Entry<Integer,Student> studentEntry: studentMap.entrySet()){
            System.out.println(studentEntry.toString());
        }

        System.out.println("...........Set");
        Set<Student> studentSet= new HashSet<>();
        studentSet.add(student);
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student);

        for(Student students:studentSet){
            System.out.println(students.toString());
        }

    }
}
