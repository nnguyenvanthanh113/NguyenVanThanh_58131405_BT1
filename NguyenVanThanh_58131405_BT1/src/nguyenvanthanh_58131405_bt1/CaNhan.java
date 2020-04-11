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
public abstract class CaNhan {
    String hoTen,tuoi,diaChi,sdt;

    public CaNhan() {
    }

    public CaNhan(String hoTen, String tuoi, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public String HienThiTT(){
        return "Họ tên :" + getHoTen() +" "
                + "tuổi :" + getTuoi() +" "
                + "địa chỉ :" + getDiaChi() +" "
                + "sdt :" + getClass();
    }
}
