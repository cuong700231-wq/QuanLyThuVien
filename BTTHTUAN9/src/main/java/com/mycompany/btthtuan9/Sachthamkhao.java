package com.mycompany.btthtuan9;
public class Sachthamkhao extends Sach {
    public double thue;

    public Sachthamkhao() {
        
    }
    public Sachthamkhao(double thue, String maSach, String NgayNhap, double donGia, int soLuong, String nhaXuatBan) {
        super(maSach, NgayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }
    public double ThanhTien()
    {
        return soLuong * donGia + thue;
    }
    
    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhap thue: ");
        this.thue = Double.parseDouble(sc.nextLine());
    }        
    
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Thue: "+ this.thue);
        System.out.println("Thanh tien: "+ this.ThanhTien());
    }

    
    
    
}
