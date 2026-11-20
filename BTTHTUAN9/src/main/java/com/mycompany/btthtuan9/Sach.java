package com.mycompany.btthtuan9;
import java.util.Scanner;
public class Sach {
    protected String maSach;
    protected String NgayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;
    Scanner sc = new Scanner(System.in);
    
    public Sach() {
           
    }

    public Sach(String maSach, String NgayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.NgayNhap = NgayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }
    
    public void Nhap()
    {
        System.out.println("Nhap ma sach: ");
        this.maSach = sc.nextLine();
        System.out.println("Nhap ngay nhap: ");
        this.NgayNhap = sc.nextLine();
        System.out.println("Nhap don gia: ");
        this.donGia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap so luong: ");
        this.soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap nha xuat ban: ");
        this.nhaXuatBan = sc.nextLine();
    }
    
    public void Xuat()
    {
        System.out.println("Ma sach: "+ this.maSach);
        System.out.println("Ngay nhap: "+ this.NgayNhap);
        System.out.println("Don gia: "+ this.donGia);
        System.out.println("So luong: "+ this.soLuong);
        System.out.println("Nha xuat ban: "+ this.nhaXuatBan);
    }
       
}
