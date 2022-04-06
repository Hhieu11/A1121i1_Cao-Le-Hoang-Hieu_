package ss17_IOFileBnary.ThucHanh;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainStudent {
    public static void writeFile (List<Student> student, String filePath){
        try {
            FileOutputStream fileOutputStream= new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            fileOutputStream.close();

        }
        catch (IOException e){
            e.printStackTrace();

        }



    }
    public static List<Student>readFile(String filePath){
        List<Student>students= new ArrayList<>();
        try {
            FileInputStream fileInputStream= new FileInputStream(filePath);
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            students= (List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return students;

    }

    public static void main(String[] args) {
        List<Student>students= new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeFile(students, "student.txt");
        List<Student>students1=readFile("student.txt");
       students1.forEach(System.out::println);
//        for (Student student : students1){
//            System.out.println(student);
//        }


    }
    }
