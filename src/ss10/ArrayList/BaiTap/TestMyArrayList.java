package ss10.ArrayList.BaiTap;

public class TestMyArrayList {
    public static class Student{
        private  int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a= new Student(1,"Hieu1");
        Student b= new Student(2,"Hieu2");
        Student c= new Student(3,"Hieu3");
        Student d= new Student(4,"Hieu4");
        Student e= new Student(5,"Hieu5");

       MyArrayList<Student> studentMyArrayList= new MyArrayList<>();
       MyArrayList<Student> studentMyArrayListNew=new MyArrayList<>();
       studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e,2);
        System.out.println(studentMyArrayList.size());
//
//        for(int i=0; i<studentMyArrayList.size();i++){
//            Student  student= (Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }


//        System.out.println(studentMyArrayList.get(2).getName());

//        System.out.println(studentMyArrayList.indexOf(c));
//        System.out.println(studentMyArrayList.contains(a));
//        studentMyArrayListNew=studentMyArrayList.clone();
//        for (int i=0;i<studentMyArrayListNew.size();i++){
//            System.out.println(studentMyArrayListNew.get(i).getName());
//        }





    }
}
