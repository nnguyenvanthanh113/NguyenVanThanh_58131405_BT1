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
public class QLDS implements IQLDS{

    ArrayList<CaNhan> canhan = new ArrayList();
    @Override
    public int them(CaNhan p) {
        canhan.add(p);
        return canhan.size();
    }

    @Override
    public int xoa(String ten) {
        for(int i=0;i<canhan.size();i++)
        {
            if(canhan.get(i).getHoTen().equals(ten))
            {
                canhan.remove(i);
            }
        }
        return canhan.size();
    }

    @Override
    public void inDS() {
        for(int i=0;i<canhan.size();i++)
        {
            System.out.println("ca nhan " + i + " :"
                          + "họ tên :" + canhan.get(i).getHoTen() + " "
                           + "tuổi :" + canhan.get(i).getTuoi() + " "
                            + "địa chỉ :" + canhan.get(i).getDiaChi() + " "
                            + "Sdt :" + canhan.get(i).getSdt());
        }
    }
    
}
