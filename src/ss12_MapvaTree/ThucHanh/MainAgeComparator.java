package ss12_MapvaTree.ThucHanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainAgeComparator {
    public static void main(String[] args) {
        Student student= new Student("Lakaka",30,"HT");
        Student student1= new Student("Sua-Ret",31,"HN");
        Student student2= new Student("Lo-lan-do",37,"QN");
        Student student3= new Student("Nay-Me", 32,"QN");


        List<Student>listS=new ArrayList<Student>();
        listS.add(student);
        listS.add(student1);
        listS.add(student2);
        listS.add(student3);
        Collections.sort(listS);
        for(Student st:listS){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator= new AgeComparator();
        Collections.sort(listS,ageComparator);
        System.out.println("so sanh theo tuoi");
        for(Student st:listS){
            System.out.println(st.toString());
        }


    }
}
