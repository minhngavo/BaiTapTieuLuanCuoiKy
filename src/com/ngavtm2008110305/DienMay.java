/*
* created date: Jan 02, 2022
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305;

import java.text.DecimalFormat;
import java.text.ParseException;


public class DienMay extends HangHoa {

    
    private int congSuat;
    private int thoiGianBaoHanh;

    public DienMay(String maHangHoa, String tenHangHoa, long giaNhap, int soLuongTonKho, String ngayNhapKho , int congSuat) throws ParseException {

        super(maHangHoa, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho);

        this.congSuat = congSuat;
        this.thoiGianBaoHanh = thoiGianBaoHanh;


    }

    public void setCongSuat(int congSuat) {

        this.congSuat = congSuat;

    }

    public int getCongSuat() {

        return congSuat;

    }
    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {

        this.thoiGianBaoHanh = thoiGianBaoHanh;

    }

    public int getThoiGianBaoHanh() {

        return thoiGianBaoHanh;

    }


    @Override

    public String toString() {

        String s ;

        s = super.toString() + String.format("%s %10d %10d", super.toString (), 
        congSuat, thoiGianBaoHanh);

        return s ;

    }  
    
}
