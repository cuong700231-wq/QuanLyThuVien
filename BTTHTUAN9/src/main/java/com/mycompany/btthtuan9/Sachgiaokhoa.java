package com.mycompany.btthtuan9;
public class Sachgiaokhoa extends Sach{
    public String tinhtrang;

    public Sachgiaokhoa() {
        
    }
    public Sachgiaokhoa(String tinhtrang, String maSach, String NgayNhap, double donGia, int soLuong, String nhaXuatBan) {
        super(maSach, NgayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhtrang = tinhtrang;
    }
    
    public double ThanhTien()
    {
        if(tinhtrang.equalsIgnoreCase("Moi"))
            return soLuong * donGia;
        else 
            return soLuong * donGia * 0.5;
    }
    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Tinh trang(Moi/Cu): ");
        this.tinhtrang = sc.nextLine();
    }
    
    @Override
    public void Xuat() {
        super.Xuat(); 
        System.out.println("Tinh trang: "+ this.tinhtrang);
        System.out.println("Thanh tien: "+ this.ThanhTien());
    }
}
