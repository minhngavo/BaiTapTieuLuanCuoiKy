/*
* created date: Jan 02, 2022
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangHoa {
    
    private static final String maHanghoa = null;
    private String maHang ;
    private String tenHangHoa;
    private long giaNhap;
    private int soLuongTonKho;
    private Date ngayNhapKho;
    public HangHoa(String maHangHoa , String tenHangHoa , long giaNhap , int soLuongTonKho2 , String ngayNhapKho2) throws ParseException {

        this.tenHangHoa = tenHangHoa ;
        this.giaNhap = giaNhap ;
        this.soLuongTonKho = soLuongTonKho;
        this.maHang = maHangHoa;
        this.ngayNhapKho = ngayNhapKho;

    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;

    }

    public String getMaHang() {
        return maHang;

    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;

    } 

    public String getTenHangHoa() {
        return tenHangHoa;

    }

    public void setGiaNhap(long giaNhap) {
        this.giaNhap = giaNhap;

    }

    public long getGiaNhap() {
        return giaNhap;

    }

    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;

    }

    public int getSoLuongTonKho() {
        return soLuongTonKho;

    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;

    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;

    }

    public static Date chuyenChuoiSangNgay(String chuoiNgay) throws ParseException{

        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        date = simpleDateFormat.parse(chuoiNgay);

        return date;

    }

	public static String chuyenNgaySangChuoi(Date date){

        String chuoiNgayViet = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        chuoiNgayViet =  simpleDateFormat.format(date);
        
        return chuoiNgayViet;

    }

    public long tinhTien(){

        return (long)(getSoLuongTonKho()*getGiaNhap());

    }
    @Override

    public String toString() {

        return "HangHoa [donGia=" + giaNhap + ", maHangHoa=" + maHanghoa + ", ngayNhapKho=" + ngayNhapKho + ", soLuongTonKho="

                + soLuongTonKho + ", tenHangHoa=" + tenHangHoa + "]";

    }
}
