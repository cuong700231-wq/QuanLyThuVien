package com.mycompany.btthtuan7;

public class SACH {
    public String maSach;
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public int soLuong;
    
    public void hienThiThongTin()
    {
        System.out.println("Ma sach: "+maSach);
        System.out.println("Tieu de: "+tieuDe);
        System.out.println("Tac gia: "+tacGia);
        System.out.println("Nam xuat ban: "+namXuatBan);
        System.out.println("So luong: "+soLuong);
    }
    public SACH (){}

    public SACH(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    
    
    
    
}
