/*
* created date: Jan 02, 2022
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305;

import java.text.ParseException;
import java.util.Date;
import java.text.DecimalFormat;


public class ThucPham extends HangHoa {
    private Date hanSuDung;
    private Date ngaySanXuat;

    public ThucPham(String maHangHoa, String tenHangHoa, long giaNhap, int soLuongTonKho2, String ngayNhapKho2, String string)
            throws ParseException {
        super(maHangHoa, tenHangHoa, giaNhap, soLuongTonKho2, ngayNhapKho2);
        

    }
    
    public Date getHanSuDung() {

        return hanSuDung;

    }

    public void setHanSuDung(Date hanSuDung) {

        this.hanSuDung = hanSuDung;

    }
    
    public Date getNgaySanXuat() {

        return ngaySanXuat;

    }

    public void setNgaySanXuat(Date ngaySanXuat) {

        this.ngaySanXuat = ngaySanXuat;

    }

    DecimalFormat ft = new DecimalFormat("###,###,### VND");

    @Override

    public String toString() {

        String s ;

        s = super.toString() + String.format( "%-10s|%-10s|", super.toString () 
        , ngaySanXuat , hanSuDung , ft.format(tinhTien()));

        return s;

    }
}
