package com.mycompany.btthtuan7;

import java.util.ArrayList;

public class BTTHTUAN7 {

    public static void main(String[] args) {
        
        SACH Toan = new SACH("T01", "Toan", "Luong The Vinh", 2018, 10);
        SACH VatLy = new SACH("V01", "Vat Ly", "Ly Ba Son", 2019, 100);
        SACH HoaHoc = new SACH("H01", "Hoa Hoc", "Cao Cu Giac", 2020, 99);
        SACH English = new SACH("E01", "Tieng Anh", "Mai Lan Huong", 2017, 25);
        
        System.out.println("THÔNG TIN TỪNG ĐỐI TƯỢNG SÁCH");
        Toan.hienThiThongTin();
        VatLy.hienThiThongTin();
        HoaHoc.hienThiThongTin();
        English.hienThiThongTin();
        
        //Tạo và quản lý danh sách Sach bằng ArrayList
        ArrayList<SACH> danhSachSach = new ArrayList<>();

        //Thêm các cuốn sách vào ArrayList
        danhSachSach.add(Toan);
        danhSachSach.add(VatLy);
        danhSachSach.add(HoaHoc);
        danhSachSach.add(English);
        danhSachSach.add(new SACH("S004", "Mang may tinh", "Nguyen Van Phat", 2024, 12));

        //Duyệt và in danh sách sách trong ArrayList
        System.out.println("\nDANH SACH SACH TRONG THU VIEN (" + danhSachSach.size() + " cuon)");
        for (SACH s : danhSachSach) {
            s.hienThiThongTin();
            System.out.println(" ");
        }
        
        System.out.println("KIEM THU GETTER VA SETTER");
        Toan.setSoLuong(50);
        Toan.setNamXuatBan(2030);
        Toan.setSoLuong(-10);
        
        System.out.println("Thong tin sach " + Toan.getTieuDe() + " sau khi cap nhat:");
        Toan.hienThiThongTin();
    }
}