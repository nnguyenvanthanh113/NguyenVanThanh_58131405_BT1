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
public class GiaoVien extends CaNhan{
    String monDay,toBoMon;

    public GiaoVien() {
    }

    
    public GiaoVien(String monDay, String toBoMon, String hoTen, String tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }
    
    @Override
    public String HienThiTT() {
        return super.HienThiTT(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
