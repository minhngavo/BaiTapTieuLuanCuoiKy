/*
* created date: Jan 02, 2022
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305;

import java.text.ParseException;
import java.util.Scanner;

public class TestKiemTra {
    

    public static void main(String[] args) throws ParseException{

        int luaChon = 0;
        Scanner input = new Scanner(System.in);
        SieuThiHangHoa l = new SieuThiHangHoa();
       

        //   HÀNG THỰC PHẨM

        //HangHoa x = new HangThucPham(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho, ngayHetHan) 

        HangHoa sp1 = new ThucPham("001", "Rau Xa Lach", 11000 ,1111, "12/09/2021","12/09/2022");

        HangHoa sp2 = new ThucPham("002", "Bi Do", 12000 , 221, "20/04/2021","20/01/2022");

        HangHoa sp3 = new ThucPham("003", "Chan Ga", 111230, 678, "17/09/2021","18/12/2021");

        HangHoa sp4 = new ThucPham("004", "Thit Heo", 234560 , 789, "23/02/2021","14/05/2022");

        HangHoa sp5 = new ThucPham("005", "Ca Thu", 342760 , 145, "11/02/2021","10/08/2021");

        HangHoa sp6 = new ThucPham("006", "Hanh", 8980 , 345, "12/04/2021","20/09/2021");

      
        //    HÀNG SÀNH SỨ

        //HangHoa x = new HangSanhSu(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho, xuatXu)

        HangHoa sp7 = new SanhSu("111", "Chen Tra", 25000, 123, "11/11/2020", "Nghe An");

        HangHoa sp8 = new SanhSu("112", "Bat", 28000, 234, "12/09/2021", "Ha Tinh");

        HangHoa sp9 = new SanhSu("113", "Am Tra", 102000, 345, "09/02/2020", "Quang Binh");

        HangHoa sp10 = new SanhSu("114", "Muong Su", 39000, 456, "10/01/2019", "Ha Noi");

        HangHoa sp11 = new SanhSu("115", "Chen Su", 98000, 567, "12/06/2021", "Long An");

        HangHoa sp12 = new SanhSu("116", "Lo Hoa", 200000, 678, "02/04/2019", "Quang Ngai");

        HangHoa sp13 = new SanhSu("117", "Ly Tra", 99000, 789, "05/12/2019", "Ninh Binh");

        //   HÀNG ĐIỆN MÁY

        //HangHoa x = new HangDienMay(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho, congSuat)

        HangHoa sp14 = new DienMay("222", "Tu Lanh", 18000000, 12,"10/06/2018", 600);

        HangHoa sp15 = new DienMay("223", "Ti Vi", 12000000, 78,"24/02/2019", 500);

        HangHoa sp16 = new DienMay("224", "Dieu Hoa", 1000000, 111,"26/09/2020", 300);

        HangHoa sp17 = new DienMay("225", "May Hut Bui", 989000, 29,"20/04/2021", 1000);

        HangHoa sp18 = new DienMay("226", "May Quat Hoi Nuoc", 6000000, 38,"11/02/2019", 1000);

        HangHoa sp19 = new DienMay("227", "May Loc Nuoc", 9000000, 31,"23/11/2018", 210);

        HangHoa sp20 = new DienMay("228", "May Giat", 18000000, 16,"09/10/2020", 200);


        //THÊM CÁC SẢN PHẨM VÀO DANH SÁCH

        l.themHangHoa(sp1);
        l.themHangHoa(sp2);
        l.themHangHoa(sp3);
        l.themHangHoa(sp4);
        l.themHangHoa(sp5);
        l.themHangHoa(sp6);
        l.themHangHoa(sp7);
        l.themHangHoa(sp8);
        l.themHangHoa(sp9);
        l.themHangHoa(sp10);
        l.themHangHoa(sp11);
        l.themHangHoa(sp12);
        l.themHangHoa(sp13);
        l.themHangHoa(sp14);
        l.themHangHoa(sp15);
        l.themHangHoa(sp16);
        l.themHangHoa(sp17);
        l.themHangHoa(sp18);
        l.themHangHoa(sp19);
        l.themHangHoa(sp20);

        
        //MENU TỔNG

        System.out.println("___________________________________________");

        System.out.println("        TRUONG DAI HOC GIA DINH            ");

        System.out.println("   TEN SINH VIEN : VO THI MINH NGA         ");

        System.out.println("        MSSV : 2008110305                  ");

        System.out.println("   MON : LAP TRINH HUONG DOI TUONG         ");

        System.out.println("   GIAO VIEN : Th.S LE HUYNH PHUOC         ");

        System.out.println("___________________________________________");

		while(luaChon != 6){

            System.out.println("===================MENU======================");

            System.out.println("|          1.Thao tac voi hang hoa :        |");

            System.out.println("|               1.1 Them                    |");

            System.out.println("|               1.2 Sua                     |");

            System.out.println("|               1.3 Xoa                     |");

            System.out.println("|          2.Tim kiem theo :                |");

            System.out.println("|               2.1 Loai                    |");

            System.out.println("|               2.2 Ngay nhap               |");

            System.out.println("|               2.3 Gia                     |");

            System.out.println("|               2.4 Gia tri cao nhat        |");

            System.out.println("|               2.5 Tong gia tri cao nhat   |");

            System.out.println("|               2.6 Gia tri thap nhat       |");

            System.out.println("|               2.7 Tong gia tri thap nhat  |");

            System.out.println("|          3.Sap xep tang dan theo :        |");

            System.out.println("|               3.1 Gia nhap                |");

            System.out.println("|               3.2 Ngay nhap               |");

            System.out.println("|               3.3 Loai va ngay nhap       |");

            System.out.println("|               3.4 Loai va gia nhap        |");

            System.out.println("|          4.Sap xep giam dan theo :        |");

            System.out.println("|               4.1 Gia nhap                |");

            System.out.println("|               4.2 Ngay nhap               |");

            System.out.println("|               4.3 Loai va ngay nhap       |");

            System.out.println("|               4.4 Loai va gia nhap        |");

            System.out.println("|          5.Thong ke :                     |");

            System.out.println("|               5.1 Thong ke theo loai      |");

            System.out.println("|               5.2 Thong ke tat ca hang    |");

            System.out.println("|          0.Thoat chuong trinh             |");

            System.out.println("===================MENU======================\n\n\n");

            System.out.print("Nhap lua chon cua ban : ");

            luaChon = input.nextInt();

            switch(luaChon){

                case 1 : {

                    //MENU THÊM SỬ XÓA HÀNG HÓA (CÁC THÔNG TIN ĐƯỢC NHẬP TỪ BÀN PHÍM)

                    System.out.println("==========MENU===========");

                    System.out.println(" 1. Them hang hoa     ");

                    System.out.println(" 1. Sua hang hoa      ");

                    System.out.println(" 1. Xoa hang hoa      ");

                    System.out.println(" 0.   Huy             ");

                    System.out.println("=========(*_*)========");

                    System.out.print("Nhap lua chon cua ban : ");

                    luaChon = input.nextInt();

                    input.nextLine();

                    switch(luaChon){

                        case 1 : l.themHangHoa();break;

                        case 2 : l.suaHangHoa();break;

                        case 3 : l.xoaHangHoa();break;             
                        
                        case 0: System.out.println("Huy");

                        default : break;

                    }

                    break;

                }

                case 2 : {

                    //MENU TÌM KIẾM HÀNG HÓA THEO LOẠI , KHOẢNG NGÀY , KHOẢNG GIÁ

                    System.out.println("=============MENU==============");

                    System.out.println("1. Tim kiem theo loai          ");
  
                    System.out.println("2. Tim kiem theo ngay nhap     ");

                    System.out.println("3. Tim kiem theo gia           ");

                    System.out.println("4. Gia tri cao nhat            ");

                    System.out.println("0. Thoat                       ");

                    System.out.println("============(*_*)==============");

                    System.out.print("Nhap lua chon cua ban : ");

                    luaChon = input.nextInt();

                    switch(luaChon){

                        case 1 : l.timKiemTheoLoai();break;

                        case 2 : l.timKiemTheoNgay();break;

                        case 3 : l.timKiemTheoGia();break;
             
                        case 0: System.out.println("Huy");
                    
                        default : break;

                    }

                    break;

                }

                case 3 : {

                    //MENU SẮP XẾP HÀNG HÓA TĂNG DẦN THEO GIÁ NHẬP , NGÀY NHẬP , THEO LOẠI VÀ NGÀY NHẬP , THEO LOẠI VÀ GIÁ NHẬP

                    System.out.println("===================MENU=================");

                    System.out.println("1. Sap xep tang dan theo :              ");

                    System.out.println("2.  Gia nhap                            ");

                    System.out.println("3.  Ngay nhap                           ");

                    System.out.println("4.  Loai va ngay nhap                   ");

                    System.out.println("5.  Loai va gia nhap                    ");

                    System.out.println("0.  Thoat                               ");

                    System.out.println("=================(*_*)==================");

                    System.out.print("Nhap lua chon cua ban : ");

                    luaChon = input.nextInt();

                    switch(luaChon){

                        case 1 : l.sapXepHangHoaTangDanTheoGia();break;

                        case 2 : l.sapXepHangHoaTangDanTheoNgay();break;

                        case 3 : l.SapXepTangDanTheoLoaiVaTheoNgayNhap();break;

                        case 4 : l.SapXepTangDanTheoLoaiVaTheoGia();break;

                        case 0: System.out.println("Huy");

                        default : break;

                    }

                    break;

                }

                case 4 : {

                    //MENU SẮP XẾP HÀNG HÓA GIẢM DẦN THEO GIÁ NHẬP , NGÀY NHẬP , THEO LOẠI VÀ NGÀY NHẬP , THEO LOẠI VÀ GIÁ NHẬP

                    System.out.println("====================MENU====================");

                    System.out.println("1. Sap xep giam dan theo          ");

                    System.out.println("2.  Gia nhap                      ");

                    System.out.println("3.  Ngay nhap                     ");

                    System.out.println("4.  Loai va ngay nhap             ");

                    System.out.println("5.  Loai va gia nhap              ");

                    System.out.println("6.  Thoat                         ");

                    System.out.println("==================(*_*)===================");

                    System.out.print("Nhap lua chon cua ban : ");

                    luaChon = input.nextInt();

                    switch(luaChon){

                        case 1 : l.sapXepHangHoaGiamDanTheoGia();break;

                        case 2 : l.sapXepHangHoaGiamDanTheoNgay();break;

                        case 3 : l.SapXepGiamDanTheoLoaiVaTheoNgayNhap();break;

                        case 4 : l.SapXepGiamDanTheoLoaiVaTheoGia();break;

                        case 0: System.out.println("Huy");

                        default : break;

                    }

                    break;

                }

                case 5 : {

                System.out.println("==========MENU==========");

                System.out.println("1. Thong ke tong so luong hang hoa ");

                System.out.println("0. Thoat ");

                System.out.println("============(*_*)===============");

                System.out.print("Nhap lua chon cua ban : ");

                luaChon = input.nextInt();

                switch(luaChon){

                    case 1 : l.thongKeTongSoLuongHangHoa();break;

                    case 0: System.out.println("Huy");

                    default : break;

                } 

                };break;

                default : break;

            
            }

        }
    }
}

