package testexam.model;

public class dienthoaichinhhang extends dienthoai{
    public int thoiGianBaoHanh;
    public String phamViBaoHanh;

    public dienthoaichinhhang() {
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public dienthoaichinhhang(int thoiGianBaoHanh, String phamViBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public dienthoaichinhhang(int id, String tenDienThoai, int gia, int soLuong, String nhaSanXuat, int thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, tenDienThoai, gia, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }


    @Override
    public String toString() {
        return super.toString()+
                "thoiGianBaoHanh=" + thoiGianBaoHanh +
                ", phamViBaoHanh='" + phamViBaoHanh + '\'' +
                '}';
    }
    public String getToCv() {
        return this.id + "," + this.tenDienThoai + "," + this.gia + "," + this.soLuong + "," + this.nhaSanXuat + "," + this.thoiGianBaoHanh + "," + this.phamViBaoHanh;
    }

}
