package ss3_MangVaPhuongThuc.ThucHanh;
import java.util.Scanner;

public class TimGiaTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Nhap vao ten can tim");
        String ip_Name=sc.nextLine();
        boolean name=false;
        for(int i=0;i<students.length;i++){
            if(students[i].equals(ip_Name)){
                System.out.println("ten co trong danh sanh "+ip_Name+"is "+ (i+1));
                name=true;
                break;
            }
        }
        if(!name){
            System.out.println("Kh co ten "+ip_Name+" trong danh sach");
        }




    }
}
