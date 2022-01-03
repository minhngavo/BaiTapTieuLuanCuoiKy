/*
* created date: Jan 02, 2022
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305;

import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.swing.ListModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SieuThiHangHoa {
    
    private static final int Comparator = 0;
    private ArrayList<HangHoa> list ;
    private Scanner input = new Scanner(System.in);

SieuThiHangHoa(){
        list = new ArrayList<HangHoa>();
    }

    public void setList(ArrayList<HangHoa> list) {
        this.list = list;
    }
    public ArrayList<HangHoa> getList() {
        return list;
    }

// CHỨC NĂNG THÊM HÀNG HÓA

    public void themHangHoa(HangHoa x) throws ParseException{
        int count = 0 ;
        for(int i = 0 ; i < list.size() ; i++){

            HangHoa sp = list.get(i);
            if(sp.getMaHang().equalsIgnoreCase(x.getMaHang()) || sp.getMaHang().equalsIgnoreCase("HTP-") ||sp.getMaHang().equalsIgnoreCase("HSS-") || sp.getMaHang().equalsIgnoreCase("HDM-") ){

                System.out.println("HANG BI LOI DO TRUNG !!!");
                count++ ;
                themHangHoa();
                break;
            }
        }

        if(count == 0){
            list.add(x);
        }
    }

    // CHỨC NĂNG THÊM HÀNG HÓA 

    public void themHangHoa() throws ParseException {

        System.out.println(" 1.Hang thuc pham           ");
        System.out.println(" 2.Hang sanh su             ");
        System.out.println(" 3.Hang dien may            ");
		System.out.println(" 0.Quay lai                 ");
        System.out.print("Nhap lua chon loai hang hoa : ");
    	int luaChon = input.nextInt();
        HangHoa x;

        switch(luaChon){

            case 1 : {
                // THỰC PHẨM

				System.out.println("\n\n\tNHAP THONG TIN HANG THUC PHAM NHAP KHO");
                System.out.print("Nhap ma hang hoa : ");
				input.nextLine();
				String maHH = input.nextLine();
				System.out.print("Nhap ten hang hoa  : ");
				String tenHH = input.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soLuongTonKho = input.nextInt();
				System.out.print("Nhap don gia (vnd) : ");
				int donGia = input.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                input.nextLine();
				String ngayNK = input.nextLine();
                System.out.print("Nhap ngay het han (dd/mm/yyyy) : ");
				String ngayHH = input.nextLine();
				x = new ThucPham( maHH, tenHH , donGia , soLuongTonKho , ngayNK , ngayHH );
				themHangHoa(x);

                break;
            }

			case 2 : {
                // SÀNH SỨ

				System.out.println("\n\n\tNHAP THONG TIN HANG SANH SU NHAP KHO"); 
                System.out.print("Nhap ma hang hoa : ");
				input.nextLine();
				String maHH = input.nextLine();
				System.out.print("Nhap ten hang hoa  : ");
				String tenHH = input.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soLuongTonKho = input.nextInt();
			    System.out.print("Nhap don gia (vnd) : ");
				int donGia = input.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                input.nextLine();
				String ngayNK = input.nextLine();
                System.out.print("Nhap nha cung cap : ");
                String nhaCC = input.nextLine();
				x = new SanhSu(maHH, tenHH, donGia , soLuongTonKho , ngayNK , nhaCC);
                themHangHoa(x);

                break;

			}

			case 3 : {
                // ĐIỆN TỬ
				System.out.println("\n\n\tNHAP THONG TIN HANG DIEN TU NHAP KHO");
                System.out.print("Nhap ma hang hoa : ");
				input.nextLine();
				String maHH = input.nextLine();
				System.out.print("Nhap ten hang hoa : ");
				String tenHH = input.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soLuongTonKho = input.nextInt();
				System.out.print("Nhap don gia (vnd) : ");
				int donGia = input.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                input.nextLine();
				String ngayNK = input.nextLine();
                System.out.print("Nhap cong suat thiet bi : ");
                int congSuat =input.nextInt();
				x = new DienMay(maHH, tenHH , donGia , soLuongTonKho,ngayNK, congSuat) ;
				themHangHoa(x);

                break;

			}

			default : break;

        } 

	}
// SỬA HÀNG HÓA
    public void suaHangHoa() throws ParseException{
        System.out.print("Nhap ma hang hoa cua hang can sua : ");
        String maHang = input.nextLine();
        for(int i = 0 ; i< list.size();i++){
            HangHoa x = list.get(i);
            if(x.getMaHang().equals(maHang)){
                if(x instanceof ThucPham){

                    String[] maHH = maHang.split("-",2);

                    System.out.println("\n\n\tNHAP THONG TIN HANG THUC PHAM CAN SUA");

                    System.out.print("Nhap ten hang hoa (khong dau) : ");

                    String tenHH = input.nextLine();

                    System.out.print("Nhap so luong ton kho : ");

                    int soLuongTonKho = input.nextInt();

                    System.out.print("Nhap don gia (vnd) : ");

                    int donGia = input.nextInt();				

                    System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");

                    input.nextLine();

                    String ngayNK = input.nextLine();

                    System.out.print("Nhap ngay het han (dd/mm/yyyy) : ");

                    String ngayHH = input.nextLine();

                    HangHoa a = new ThucPham( maHH[1], tenHH , donGia , soLuongTonKho , ngayNK , ngayHH );

                    list.add(list.indexOf(x),a);

                    list.remove(x);

                }

                else if(x instanceof SanhSu){

                    String[] maHH = maHang.split("-",2);

                    System.out.println("\n\n\tNHAP THONG TIN HANG SANH SU CAN SUA"); 

                    System.out.print("Nhap ten hang hoa(khong dau) : ");

                    String tenHH = input.nextLine();

                    System.out.print("Nhap so luong ton kho : ");

                    int soLuongTonKho = input.nextInt();

                    System.out.print("Nhap don gia (vnd) : ");

                    int donGia = input.nextInt();				

                    System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");

                    input.nextLine();

                    String ngayNK = input.nextLine();

                    System.out.print("Nhap nha cung cap : ");

                    String nhaCC = input.nextLine();

                    HangHoa a = new SanhSu(maHH[1], tenHH, donGia , soLuongTonKho , ngayNK , nhaCC);

                    list.add(list.indexOf(x),a);

                    list.remove(x);

                }

                else if(x instanceof DienMay){

                    String[] maHH = maHang.split("-",2);

                    System.out.println("\n\n\tNHAP THONG TIN HANG DIEN TU CAN SUA");

                    System.out.print("Nhap ten hang hoa(khong dau) : ");

                    String tenHH = input.nextLine();

                    System.out.print("Nhap so luong ton kho : ");

                    int soLuongTonKho = input.nextInt();

                    System.out.print("Nhap don gia (vnd) : ");

                    int donGia = input.nextInt();				

                    System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");

                    input.nextLine();

                    String ngayNK = input.nextLine();

                    System.out.print("Nhap cong suat thiet bi : ");

                    int congSuat =input.nextInt();

                    HangHoa a = new DienMay(maHH[1], tenHH , donGia , soLuongTonKho,ngayNK, congSuat) ;

                    list.add(list.indexOf(x),a);

                    list.remove(x);

                }

            }

        }

    }
// XÓA  HÀNG HÓA

    public void xoaHangHoa(){
        System.out.print("Nhap ma hang hoa can xoa : ");
		String maHH = input.nextLine();
		for(int i = 0 ; i <list.size() ; i++){
            HangHoa x = list.get(i);
            if(x.getMaHang().equals(maHH)){
                list.remove(x);
            }

        }

    }
// XUẤT 

    public void xuatHangThucPham(){
        System.out.println("HANG THUC PHAM");
		for (int i =0; i< 149; i++) {
			System.out.print("-");

		}

		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Ngay het han","Tong gia tri");

        for (int i =0; i< 149; i++) {
			System.out.print("-");

		}

        System.out.println();
        for (HangHoa hangHoa : list) {
            if(hangHoa instanceof ThucPham){
                System.out.println(hangHoa);

            }

        }

        for (int i =0; i< 149; i++) {
			System.out.print("-");

		}

        System.out.println();
    }


    public void xuatHangSanhSu(){

        System.out.println("HANG SANH SU");
		for (int i =0; i< 149; i++) {
			System.out.print("-");

		}

		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Xuat xu","Tong gia tri");

        for (int i =0; i< 149; i++) {
			System.out.print("-");

		}

        System.out.println();
        for (HangHoa hangHoa : list) {
            if(hangHoa instanceof SanhSu){
                System.out.println(hangHoa);

            }

        }

        for (int i =0; i< 149; i++) {
			System.out.print("-");

		}

        System.out.println();

    }

    public void xuatHangDienMay(){

        System.out.println("HANG DIEN MAY");
		for (int i =0; i< 149; i++) {
			System.out.print("-");

		}

		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Cong suat","Tong gia tri");

        for (int i =0; i< 149; i++) {
			System.out.print("-");

		}

        System.out.println();
        for (HangHoa hangHoa : list) {
            if(hangHoa instanceof DienMay){
                System.out.println(hangHoa);

            }

        }

        for (int i =0; i< 129; i++) {
			System.out.print("-");

		}

        System.out.println();

    }

    public void xuatHangThucPham(HangHoa x){

		for (int i =0; i< 129; i++) {
			System.out.print("-");

		}

		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Ngay het han","Tong gia tri");

        for (int i =0; i< 129; i++) {
			System.out.print("-");

		}

        System.out.println();
        System.out.println(x);
        for (int i =0; i< 129; i++) {
			System.out.print("-");

		}

        System.out.println();
    }

    public void xuatHangSanhSuTrucTiep(HangHoa x){

		for (int i =0; i< 129; i++) {

			System.out.print("-");

		}

		System.out.println();

        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Xuat xu","Tong gia tri");

        for (int i =0; i< 129; i++) {

			System.out.print("-");

		}

        System.out.println();

        System.out.println(x);

        for (int i =0; i< 129; i++) {

			System.out.print("-");

		}

        System.out.println();

    }

    public void xuatHangDienMayTrucTiepLoai1(HangHoa x){

		for (int i =0; i< 129; i++) {
			System.out.print("-");

		}

		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Cong suat","Tong gia tri");

        for (int i =0; i< 149; i++) {
			System.out.print("-");

		}

        System.out.println();
        System.out.println(x);
        for (int i =0; i< 149; i++) {
			System.out.print("-");

		}

        System.out.println();

    }

    public void xuatHangThucPhamTheoDanhSach(ArrayList<HangHoa> l){

        System.out.println("\t\t\t\t\t\t\t\tHANG THUC PHAM");
		for (int i =0; i< 149; i++) {
			System.out.print("-");

		}

		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Ngay het han","Tong gia tri");

        for (int i =0; i< 149; i++) {
			System.out.print("-");

		}

        System.out.println();
        for (HangHoa hangHoa : l) {
            System.out.println(hangHoa);

        }

        for (int i =0; i< 149; i++) {
			System.out.print("-");

		}

        System.out.println();



    }

    public void xuatHangSanhSuTheoDanhSach(ArrayList<HangHoa> l){

        System.out.println("\t\t\t\t\t\t\t\tHANG SANH SU");
		for (int i =0; i< 129; i++) {
			System.out.print("-");

		}

		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Xuat xu","Tong gia tri");

        for (int i =0; i< 129; i++) {
			System.out.print("-");

		}

        System.out.println();
        for (HangHoa hangHoa : l) {
            System.out.println(hangHoa);

        }

        for (int i =0; i< 129; i++) {
			System.out.print("-");

		}

        System.out.println();

    }


    public void xuatHangDienMayTheoDanhSach(ArrayList<HangHoa> l){

        System.out.println("(HANG DIEN MAY):");
		for (int i =0; i< 129; i++) {
			System.out.print("-");

		}

		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Cong suat","Tong gia tri");

        for (int i =0; i< 149; i++) {
			System.out.print("-");

		}

        System.out.println();
        for (HangHoa hangHoa : l) {
            System.out.println(hangHoa);

        }

        for (int i =0; i< 149; i++) {

			System.out.print("-");

		}

        System.out.println();

    }

    public void xuatToanBoTatCa(){

        for(int i = 0 ; i < list.size() ; i++){
           HangHoa x = list.get(i);
            if(x instanceof ThucPham){
                xuatHangThucPham(x);

            }

            else if(x instanceof SanhSu){
                xuatHangSanhSuTrucTiep(x);

            }

            else if(x instanceof DienMay){

                xuatHangDienMayTrucTiepLoai1(x);

            }

        }

    }
// SẮP XẾP TĂNG DẦN VÀ GIẢM DẦN
    public void sapXepHangHoaGiamDanTheoGia(){
        Collections.sort(list,new Comparator<HangHoa>(){

            @Override

            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return 1 ;

                }
                else {

                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;

                    }
                    else {

                        return -1 ;

                    }

                }

            }

        });

    }

    public void sapXepHangHoaTangDanTheoGia(){

        Collections.sort(list,new Comparator<HangHoa>(){

            @Override

            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return -1 ;

                }

                else {

                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;

                    }

                    else {

                        return 1 ;

                    }

                }

            }

        });

    }

    public void sapXepHangHoaTangDanTheoNgay(){

        Collections.sort(list,new Comparator<HangHoa>(){

            @Override

            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return -1 ;

                }

                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){

                        return 0 ;

                    }

                    else {

                        return 1 ;

                    }

                }

            }

        });

    }

    public void sapXepHangHoaGiamDanTheoNgay(){

        Collections.sort(list,new Comparator<HangHoa>(){

            @Override

            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return 1 ;

                }

                else {

                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;

                    }

                    else {

                        return -1 ;

                    }

                }

            }

        });

    }

    public void SapXepTangDanTheoLoaiVaTheoNgayNhap(){

        ArrayList<HangHoa> list1 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list2 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list3 = new ArrayList<HangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x instanceof ThucPham){
                list1.add(x);

            }

            else if(x instanceof SanhSu){
                list2.add(x);

            }

            else if(x instanceof DienMay){
                list3.add(x);

            }

        }

        Collections.sort(list1,new Comparator<HangHoa>(){

            @Override

            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return -1 ;

                }

                else {

                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;

                    }

                    else {

                        return 1 ;

                    }

                }

            }

        });

        xuatHangThucPhamTheoDanhSach(list1);

        Collections.sort(list2,new Comparator<HangHoa>(){

            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return -1 ;

                }

                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){

                        return 0 ;

                    }

                    else {

                        return 1 ;

                    }

                }

            }

        });

        xuatHangSanhSuTheoDanhSach(list2);

        Collections.sort(list3,new Comparator<HangHoa>(){

            @Override

            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return -1 ;

                }

                else {

                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;

                    }

                    else {

                        return 1 ;

                    }

                }

            }

        });

        xuatHangDienMayTheoDanhSach(list3);

    }

    public void SapXepGiamDanTheoLoaiVaTheoNgayNhap(){

        ArrayList<HangHoa> list1 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list2 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list3 = new ArrayList<HangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x instanceof ThucPham){

                list1.add(x);

            }

            else if(x instanceof SanhSu){

                list2.add(x);

            }

            else if(x instanceof DienMay){

                list3.add(x);

            }

        }

        Collections.sort(list1,new Comparator<HangHoa>(){

            @Override

            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return 1 ;

                }

                else {

                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;

                    }

                    else {

                        return -1 ;

                    }

                }

            }

        });

        xuatHangThucPhamTheoDanhSach(list1);

        Collections.sort(list2,new Comparator<HangHoa>(){

            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return 1 ;

                }

                else {

                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;

                    }

                    else {

                        return -1 ;

                    }

                }

            }

        });

        xuatHangSanhSuTheoDanhSach(list2);

        Collections.sort(list3,new Comparator<HangHoa>(){

            @Override

            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return 1 ;

                }

                else {

                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;

                    }

                    else {

                        return -1 ;

                    }

                }

            }

        });

        xuatHangDienMayTheoDanhSach(list3);

    }

    public void SapXepTangDanTheoLoaiVaTheoGia(){

        ArrayList<HangHoa> list1 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list2 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list3 = new ArrayList<HangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x instanceof ThucPham){

                list1.add(x);

            }

            else if(x instanceof SanhSu){

                list2.add(x);

            }

            else if(x instanceof DienMay){

                list3.add(x);

            }

        }

        Collections.sort(list1,new Comparator<HangHoa>(){

            @Override

            public int compare(HangHoa o1, HangHoa o2) {

                if(o1.getGiaNhap() < o2.getGiaNhap()){

                    return -1 ;

                }

                else {

                    if(o1.getGiaNhap() == o2.getGiaNhap()){

                        return 0 ;

                    }

                    else {

                        return 1 ;

                    }

                }

            }

        });

        xuatHangThucPhamTheoDanhSach(list1);

        Collections.sort(list2,new Comparator<HangHoa>(){

            @Override

            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return -1 ;

                }

                else {

                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;

                    }

                    else {

                        return 1 ;

                    }

                }

            }

        });

        xuatHangSanhSuTheoDanhSach(list2);

        Collections.sort(list3,new Comparator<HangHoa>(){

            @Override

            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){

                    return -1 ;

                }

                else {

                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;

                    }

                    else {

                        return 1 ;

                    }

                }

            }

        });

        xuatHangDienMayTheoDanhSach(list3);

    }

    public void SapXepGiamDanTheoLoaiVaTheoGia(){

        ArrayList<HangHoa> list1 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list2 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list3 = new ArrayList<HangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x instanceof ThucPham){
                list1.add(x);

            }

            else if(x instanceof SanhSu){

                list2.add(x);

            }

            else if(x instanceof DienMay){

                list3.add(x);

            }

        }

        Collections.sort(list1,new Comparator<HangHoa>(){

            @Override

            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return 1 ;

                }

                else {

                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;

                    }

                    else {

                        return -1 ;

                    }

                }

            }

        });

        xuatHangThucPhamTheoDanhSach(list1);

        Collections.sort(list2,new Comparator<HangHoa>(){

            @Override

            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return 1 ;

                }

                else {

                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;

                    }

                    else {

                        return -1 ;

                    }

                }

            }

        });

        xuatHangSanhSuTheoDanhSach(list2);

        Collections.sort(list3,new Comparator<HangHoa>(){

            @Override

            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return 1 ;

                }

                else {

                    if(o1.getGiaNhap() == o2.getGiaNhap()){

                        return 0 ;

                    }

                    else {

                        return -1 ;

                    }

                }

            }

        });

        xuatHangDienMayTheoDanhSach(list3);

    }

    public void timKiemTheoLoai(){

        int luaChon = 0;
		System.out.println(" 1. Hang thuc pham     ");
		System.out.println(" 2. Hang sanh su       ");
		System.out.println(" 3. Hang dien may      ");
        System.out.print("Nhap lua chon cua ban :  ");
		luaChon = input.nextInt();
		switch(luaChon){

			case 1 :{System.out.println("CAC LOAI MAT HANG THUC PHAM LA :");

					 xuatHangThucPham();

					 break;

					}

			case 2 :{System.out.println("CAC LOAI MAT HANG SANH SU LA : ");

					 xuatHangSanhSu();

					 break;

					}

			case 3 :{System.out.println("CAC LOAI MAT HANG ĐIEN MAY LA :");

					 xuatHangDienMay();

					 break;

					}

		}

    }

    public void timKiemTheoNgay() throws ParseException{

        System.out.println("Thoi gian can tim kiem tu ngay : ");

		String ngayBatDau = input.nextLine();

		System.out.println(" den ngay :");

		String ngayKetThuc = input.nextLine();

		System.out.println("CAC LOAI HANG DA NHAP KHO TU NGAY " + ngayBatDau +" DEN NGAY " + ngayKetThuc + " LA :");

        for(int i = 0 ; i<list.size() ; i++){

            HangHoa x = list.get(i);

            if(x.getNgayNhapKho().compareTo(chuyenChuoiSangNgay(ngayBatDau)) >= 0 && x.getNgayNhapKho().compareTo(chuyenChuoiSangNgay(ngayKetThuc))<=0  ){

                if(x instanceof ThucPham){
                    xuatHangThucPham(x);

                }

                else if(x instanceof SanhSu){
                    xuatHangSanhSuTrucTiep(x);

                }

                else if(x instanceof DienMay){
                    xuatHangDienMayTrucTiepLoai1(x);

                }

            }

        }

    }

    public void timKiemTheoGia(){

        System.out.println("Gia can tim kiem tu : ");

		long giaBatDau = input.nextInt();

		System.out.println(" den : ");

		long giaKetThuc = input.nextInt();

        for(int i = 0 ; i < list.size() ; i++){

            HangHoa x = list.get(i);

            if(x.getGiaNhap() >= giaBatDau && x.getGiaNhap() <= giaKetThuc){

                if(x instanceof ThucPham){
                    xuatHangThucPham(x);

                }

                else if(x instanceof SanhSu){
                    xuatHangSanhSuTrucTiep(x);

                }

                else if(x instanceof DienMay){
                    xuatHangDienMayTrucTiepLoai1(x);

                }

            }

        }

    }


    public static Date chuyenChuoiSangNgay(String chuoiNgay) throws ParseException{

        Date date;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");

        date = simpleDateFormat.parse(chuoiNgay);

        return date;

    }
    
    DecimalFormat ft = new DecimalFormat("###,###,### VND");

    public void thongKeTongSoLuongHangHoa(){

        long tongSoLuong = 0 ,tongChiPhi = 0;
        for (HangHoa hangHoa : list) {
            tongSoLuong += hangHoa.getSoLuongTonKho();
            tongChiPhi += hangHoa.tinhTien();

        }

		SapXepTangDanTheoLoaiVaTheoGia();
        for (int i =0; i< 129; i++) {
			System.out.print("-");

		}

		System.out.println();
        System.out.printf("|%-34s|%-112d|\n","Tong so luong hang trong kho",tongSoLuong);

        for (int i =0; i< 129; i++) {
			System.out.print("-");

		}

		System.out.println();
        System.out.printf("|%-34s|%-25s%-67s%-20s|\n","Tong chi phi hang trong kho"," "," ",ft.format(tongChiPhi));

        for (int i =0; i< 129; i++) {
			System.out.print("-");

		}
                                                            
    }

}
