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
public class NguyenVanThanh_58131405_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //tao 2 hoc sinh
        HocSinh hs1 = new HocSinh("K58 CNTT-2", "choi game", "Nguyen Van Thanh", "22", "Khanh Hoa", "0898382116");
        HocSinh hs2 = new HocSinh("K58 CNTT-2", "mua", "Nguyen Thi Thu", "22", "Khanh Hoa", "0898382116");
    
        //tao 2 giao vien
        GiaoVien gv1 = new GiaoVien("Mau Thiet Ke", "Phan Mem", "Huynh Tuan Anh", "45", "Khanh Hoa", "01658780033");
        GiaoVien gv2 = new GiaoVien("Lap Trinh Thiet Bi Di Dong", "Phan Mem", "Huynh Tuan Anh", "45", "Khanh Hoa", "01658780033");
    
        //them hoc sinh
        LopHoc lophoc = new LopHoc();
        lophoc.themHocSinh(hs1);
        lophoc.themHocSinh(hs2);
        
        //them giao vien
        lophoc.themGVGD(gv1);
        lophoc.themGVGD(gv2);
        
        //in danh sach hoc sinh trog lop
        System.out.println(lophoc.inDSHS());
        
        //in danh sach giao vien trong lop
        System.out.println(lophoc.inDSGVGD());
        
    }
    
    //
    //LopHoc lophoc = new LopHoc();
    
}
