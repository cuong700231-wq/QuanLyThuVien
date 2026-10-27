package com.mycompany.quanlythuvien;
import java.util.Scanner;
public class BTTHTUAN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bài 1: Nhập mã sách, tên sách, tác giả, năm xuất bản, đơn giá, số lượng và hiển thị lại 
        System.out.println("NHAP THONG TIN SACH:");
        
        System.out.print("Nhap ma sach:");    
        String masach = sc.nextLine();
        
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();

        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();

        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();
        //Bài 2:Tính thành tiền = đơn giá × số lượng.
        double ThanhTien = donGia * soLuong;
        //Bài 3:Bài 3: Phí vận chuyển = 5% giá trị sách.
        double PhiVanChuyen = ThanhTien * 0.05;
        //Bài 4:Tổng tiền nhập = Thành tiền + Phí vận chuyển 
        double TongTien = ThanhTien + PhiVanChuyen;
        
        System.out.println("\nTHONG TIN SACH & GIA TRI NHAP KHO");
        System.out.println("Ma sach        : " + masach);
        System.out.println("Ten sach       : " + tenSach);
        System.out.println("Tac gia        : " + tacGia);
        System.out.println("Nam xuat ban   : " + namXuatBan);
        System.out.printf("Don gia        : %,.0f VND\n", donGia);
        System.out.println("So luong       : " + soLuong);
        System.out.printf("Thanh tien     : %,.0f VND\n", ThanhTien);
        System.out.printf("Phi van chuyen : %,.0f VND\n", PhiVanChuyen);
        System.out.printf("Tong tien nhap : %,.0f VND\n", TongTien);
    }
}
