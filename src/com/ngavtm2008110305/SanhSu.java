/*
* created date: Jan 02, 2022
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305;

import java.text.DecimalFormat;
import java.text.ParseException;

public class SanhSu extends HangHoa {
    private String noiXuatXu;

    public SanhSu(String maHangHoa, String tenHangHoa, long giaNhap, int soLuongTonKho2, String ngayNhapKho2, String string)
            throws ParseException {
        super(maHangHoa, tenHangHoa, giaNhap, soLuongTonKho2, ngayNhapKho2);
        this.noiXuatXu = noiXuatXu;

    }

    public String getXuatXu() {

        return noiXuatXu;

    }

    public void setXuatXu(String xuatXu) {

        this.noiXuatXu = noiXuatXu;

    }

    DecimalFormat ft = new DecimalFormat("###,###,### VND");

    @Override

    public String toString() {

        String s;

        s = super.toString() + String.format("%-10s|%-10s|", getXuatXu(),ft.format(tinhTien()));

        return s;

    }

    
}
