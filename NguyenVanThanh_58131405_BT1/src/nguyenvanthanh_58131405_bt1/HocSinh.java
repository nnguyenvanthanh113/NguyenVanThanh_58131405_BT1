/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvanthanh_58131405_bt1;

/**
 *
 * @author ThanhMickey
 */
public class HocSinh extends CaNhan{
    String lop,nangKhieu;

    public HocSinh(String lop, String nangKhieu, String hoTen, String tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    
    @Override
    public String HienThiTT() {
        return super.HienThiTT(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
