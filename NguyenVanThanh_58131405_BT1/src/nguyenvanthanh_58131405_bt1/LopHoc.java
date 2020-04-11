/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvanthanh_58131405_bt1;

import java.util.ArrayList;

/**
 *
 * @author ThanhMickey
 */
public class LopHoc {
    
    ArrayList<HocSinh> hocsinh = new ArrayList();
    ArrayList<GiaoVien> giaovien = new ArrayList();
    ArrayList<QLDS> qlds = new ArrayList();
    
    
    public int themHocSinh(HocSinh hs){
            hocsinh.add(hs);
            //System.out.println("da them");
        
        return hocsinh.size();
    }
    public int themGVGD(GiaoVien gv){
            giaovien.add(gv);
        
        return giaovien.size();
    }
    public int inDSHS(){
        for(int i = 0;i < hocsinh.size();i++)
        {
            System.out.println("hoc sinh " + (i+1) + ":"
                 + "họ tên :" + hocsinh.get(i).getHoTen() + " "
                           + "tuổi :" + hocsinh.get(i).getTuoi() + " "
                            + "địa chỉ :" + hocsinh.get(i).getDiaChi() + " "
                            + "Sdt :" + hocsinh.get(i).getSdt() + " "
                            + "lop :" + hocsinh.get(i).getLop() + " "
                            + "nagn khieu :" + hocsinh.get(i).getNangKhieu());
        }
        return hocsinh.size();
    }
    public int inDSGVGD(){
         for(int i = 0;i < giaovien.size();i++)
        {
            System.out.println("giao vien " + (i+1) + ":"
                 + "họ tên :" + giaovien.get(i).getHoTen() + " "
                           + "tuổi :" + giaovien.get(i).getTuoi() + " "
                            + "địa chỉ :" + giaovien.get(i).getDiaChi() + " "
                            + "Sdt :" + giaovien.get(i).getSdt() + " "
                            + "mon day :" + giaovien.get(i).getMonDay() + " "
                            + "nagn khieu :" + giaovien.get(i).getToBoMon());
        }
        return giaovien.size();
    }
}
