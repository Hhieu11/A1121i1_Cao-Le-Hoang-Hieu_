package ss1_IntroductiontoJava.BaiTap;
import java.util.Scanner;

public class DocChuThanhSo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao so");
        int so = input.nextInt();
        String ketQua = "";
        String soDau = "";
        String soThuHai = "";
        String soThuBa = "";
        if(so >= 0 && so<10) {
            switch (so) {
                case 0: ketQua = "khong"; break;
                case 1: ketQua = "mot"; break;
                case 2: ketQua = "hai"; break;
                case 3: ketQua = "ba"; break;
                case 4: ketQua = "bon"; break;
                case 5: ketQua = "nam"; break;
                case 6: ketQua = "sau"; break;
                case 7: ketQua = "bay"; break;
                case 8: ketQua = "tam"; break;
                case 9: ketQua = "chin"; break;
            }
        }else if(so>=10 && so<20) {
            switch (so%10) {
                case 0: ketQua = "muoi";break;
                case 1: ketQua = "muoi mot";break;
                case 2: ketQua = "muoi hai";break;
                case 3: ketQua = "muoi ba";break;
                case 4: ketQua = "muoi bon";break;
                case 5: ketQua= "muoi lam";break;
                case 6: ketQua = "muoi sau";break;
                case 7: ketQua = "muoi bay";break;
                case 8: ketQua = "muoi tam";break;
                case 9: ketQua = "muoi chin";break;
            }
        } else if(so >=20) {
            if(so<100) {
                switch (so/10) {
                    case 2: soDau = "hai muoi";break;
                    case 3: soDau = "ba muoi";break;
                    case 4:soDau = "bon muoi";break;
                    case 5: soDau = "nam muoi";break;
                    case 6: soDau = "sau muoi";break;
                    case 7: soDau = "bay muoi";break;
                    case 8: soDau = "tam muoi";break;
                    case 9: soDau = "chin muoi";break;
                }
                switch (so%10) {
                    case 1: soThuHai = "mot"; break;
                    case 2:soThuHai = "hai"; break;
                    case 3: soThuHai = "ba"; break;
                    case 4: soThuHai = "bon"; break;
                    case 5: soThuHai = "nam"; break;
                    case 6: soThuHai = "sau"; break;
                    case 7: soThuHai = "bay"; break;
                    case 8: soThuHai = "tam"; break;
                    case 9: soThuHai = "chin"; break;
                } ketQua = soDau + " " + soThuHai;
            }else if(so<1000) {
                switch (so/100) {
                    case 1: soDau = "mot tram";break;
                    case 2: soDau = "hai tram";break;
                    case 3: soDau = "ba tram";break;
                    case 4: soDau = "bon tram";break;
                    case 5: soDau = "nam tram";break;
                    case 6: soDau = "sau tram";break;
                    case 7: soDau= "bay tram";break;
                    case 8:soDau = "tam tram";break;
                    case 9:soDau = "chin tram";break;
                }
                switch ((so/10)%10) {
                    case 2: soThuHai = "hai muoi";break;
                    case 3: soThuHai = "ba muoi";break;
                    case 4: soThuHai = "bon muoi";break;
                    case 5: soThuHai= "nam muoi";break;
                    case 6: soThuHai = "sau muoi";break;
                    case 7: soThuHai = "bay muoi";break;
                    case 8: soThuHai = "tam muoi";break;
                    case 9: soThuHai = "chin muoi";break;
                }
                switch (so%10) {
                    case 1: soThuBa = "mot"; break;
                    case 2: soThuBa = "hai"; break;
                    case 3: soThuBa= "ba"; break;
                    case 4: soThuBa = "bon"; break;
                    case 5: soThuBa = "nam"; break;
                    case 6: soThuBa = "sau"; break;
                    case 7: soThuBa = "bay"; break;
                    case 8: soThuBa = "tam"; break;
                    case 9: soThuBa = "chin"; break;
                }
                if(so%100 == 0) {
                    ketQua = soDau;
                }else {ketQua = soDau + soThuHai + soThuBa;}
            } else ketQua = "Khong co so";
        }
        System.out.println(ketQua);    }
}
