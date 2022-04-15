package testexam.service;

import testexam.model.dienthoaichinhhang;
import testexam.model.dienthoaixachtay;
import testexam.util.ReadAndWrite;
import testexam.util.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quanlidienthoai {

    static Scanner scanner = new Scanner(System.in);
    static int count = 0;
    public static List<dienthoaichinhhang> dienthoaichinhhangList = new ArrayList<>();
    public static List<dienthoaixachtay> dienthoaixachtayList = new ArrayList<>();


    public static dienthoaichinhhang getChinhhang() {
        int id = ++count;
        //int id, String tenDienThoai, int soLuong, String nhaSanXuat, int thoiGianBaoHanh, String phamViBaoHanh


        System.out.println("Tên Điện Thoại ");
        String tenSP = scanner.nextLine();
        while (!RegexData.nameValidate(tenSP)){
            System.out.println("sai dinh dang nhập lại");
            tenSP=scanner.nextLine();

        }
        RegexData.nameValidate(tenSP);


        System.out.println("Gia bán ");
        int gia = Integer.parseInt(scanner.nextLine());
        System.out.println(" Số Lượng ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println(" Nhà Sản Xuất ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Thoi gian bao hanh");
        int thoiGian = Integer.parseInt(scanner.nextLine());
        System.out.println("Phạm vi bảo hành");
        String phamVi = scanner.nextLine();
        return new dienthoaichinhhang(id, tenSP, gia, soLuong, nhaSanXuat, thoiGian, phamVi);


    }

    //    regex



// regex



    public void displayChinhHang() {
        List<dienthoaichinhhang> dienthoaichinhhangList = ReadAndWrite.readmobileCH();
        for (dienthoaichinhhang o : dienthoaichinhhangList) {
            System.out.println(o.toString());
        }
    }

    public void addNewChinhHang() {
        dienthoaichinhhang dienthoaichinhhang1 = getChinhhang();
        dienthoaichinhhangList.add(dienthoaichinhhang1);
        ReadAndWrite.writemobileCH(dienthoaichinhhangList, true);


    }

    public List<dienthoaichinhhang> timkiemchinhhang() {
        List<dienthoaichinhhang> dienthoaichinhhangList = ReadAndWrite.readmobileCH();
        System.out.println("Nhap ten can tim ");
        String name = scanner.nextLine();
        boolean check = false;

        for (int i = 0; i < dienthoaichinhhangList.size(); i++) {
            if (dienthoaichinhhangList.get(i).getTenDienThoai().contains(name)) {
                System.out.println(dienthoaichinhhangList.get(i));
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("không tìm thấy");
        }
        return dienthoaichinhhangList;
    }

    public static List<dienthoaichinhhang> xoaChinhHang() {
        List<dienthoaichinhhang> dienthoaichinhhangList = ReadAndWrite.readmobileCH();
        System.out.println("Nhap id can xoa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < dienthoaichinhhangList.size(); i++) {
            if (id == (dienthoaichinhhangList.get(i).getId())) {
                dienthoaichinhhangList.remove(dienthoaichinhhangList.get(i));
                ReadAndWrite.writemobileCH(dienthoaichinhhangList, false);
            }
        }
        return dienthoaichinhhangList;
    }

    public static dienthoaixachtay getXachtay() {
        int id = ++count;
        //int id, String tenDienThoai, int soLuong, String nhaSanXuat, int thoiGianBaoHanh, String phamViBaoHanh
        System.out.println("Tên Điện Thoại ");
        String tenSP = scanner.nextLine();
        System.out.println("Gia bán ");
        int gia = Integer.parseInt(scanner.nextLine());
        System.out.println(" Số Lượng ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println(" Nhà Sản Xuất ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Quốc gia");
        String quocGia = scanner.nextLine();
        System.out.println("Trạng Thái");
        String trangThai = scanner.nextLine();
        return new dienthoaixachtay(id, tenSP, gia, soLuong, nhaSanXuat, quocGia, trangThai);

    }


//    regex



// regex

    public void displayXachtay() {
        List<dienthoaixachtay> dienthoaixachtayList = ReadAndWrite.readmobileXT();
        for (dienthoaixachtay o : dienthoaixachtayList) {
            System.out.println(o.toString());
        }
    }

    public void addnewXachtay() {
        dienthoaixachtay dienthoaixachtay1 = getXachtay();
        dienthoaixachtayList.add(dienthoaixachtay1);
        ReadAndWrite.writemobileXT(dienthoaixachtayList, true);
    }

    public List<dienthoaichinhhang> timkiemXachTay() {
        List<dienthoaixachtay> dienthoaixachtayList = ReadAndWrite.readmobileXT();
        System.out.println("Nhap ten can tim");
        String name = scanner.nextLine();
        for (int i = 0; i < dienthoaixachtayList.size(); i++) {
            if ( (dienthoaixachtayList.get(i).getTenDienThoai().contains(name))) {
                System.out.println(dienthoaixachtayList.get(i));

            }

        }
        return null;
//        return dienthoaixachtayList;

    }

//   public List<dienthoaixachtay> xoaXachTay() {
//       List<dienthoaixachtay> dienthoaixachtayList= ReadAndWrite.readmobileXT();
//       System.out.println("Nhap id can xoa");
//       int id = Integer.parseInt(scanner.nextLine());
//       for (int i = 0; i < dienthoaixachtayList.size(); i++) {
//           if (id == (dienthoaixachtayList.get(i).getId())) {     dienthoaixachtayList.remove(dienthoaixachtayList.get(i));
//                ReadAndWrite.writemobileCH(dienthoaixachtayList,false);
//
//           }
//        }
//       return dienthoaixachtayList;
//   }
}
