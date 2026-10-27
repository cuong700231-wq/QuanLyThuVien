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
        
        System.out.print("Nhap lua chon cua ban (1-4): ");
        int loaiSach = sc.nextInt();
        //Bài 2:Tính thành tiền = đơn giá × số lượng.
        double ThanhTien = donGia * soLuong;
        //Bài 3:Bài 3: Phí vận chuyển = 5% giá trị sách.
        double PhiVanChuyen = ThanhTien * 0.05;
        //Bài 4:Tổng tiền nhập = Thành tiền + Phí vận chuyển 
        double TongTien = ThanhTien + PhiVanChuyen;
        
        System.out.println("\nTHONG TIN SACH");
        System.out.println("Ma sach        : " + masach);
        System.out.println("Ten sach       : " + tenSach);
        System.out.println("Tac gia        : " + tacGia);
        System.out.println("Nam xuat ban   : " + namXuatBan);
        System.out.printf("Don gia        : %,.0f VND\n", donGia);
        System.out.println("So luong       : " + soLuong);
        System.out.printf("Thanh tien     : %,.0f VND\n", ThanhTien);
        System.out.printf("Phi van chuyen : %,.0f VND\n", PhiVanChuyen);
        System.out.printf("Tong tien nhap : %,.0f VND\n", TongTien);
        
        //Kiểm tra giá > 0, số lượng >= 0, năm xuất bản hợp lệ.
        if(donGia > 0 && soLuong >= 0 && namXuatBan > 0 && namXuatBan <= 2026)
            System.out.println("Thong tin sach hop le!");
        else
            System.out.println("Thong tin sach khong hop le!");
        
        /*Phân loại giá: thấp, trung bình, cao, đặc biệt. Giá < 50.000 → Sách giá thấp, 
        50.000–100.000 → Sách giá trung bình, 100.000–200.000 → Sách giá cao,  >200.000 → Sách giá đặc biệt*/
        if(donGia < 0)
            System.out.println("Loai Gia: Gia khong hop le!");
        else if(donGia < 50000)
            System.out.println("Loai Gia: Sach gia thap");
        else if(donGia <= 100000)
            System.out.println("Loai Gia: Sach gia trung binh");
        else if(donGia <= 200000)
            System.out.println("Loai Gia: Sach gia cao");
        else
            System.out.println("Loai Gia: Sach gia dac biet");
            
        //Phân loại tồn kho: hết, sắp hết, còn ít, còn nhiều. 0 → Hết sách, 1–5 → Sắp hết, 6–20 → Còn ít, >20 → Còn nhiều
        if (soLuong < 0) 
            System.out.println("Ton kho: So luong khong hop le");
        else if (soLuong == 0) 
            System.out.println("Ton kho: Het sach");
        else if (soLuong <= 5) 
            System.out.println("Ton kho: Sap het");
        else if (soLuong <= 20) 
            System.out.println("Ton kho: Con it");
        else 
            System.out.println("Ton kho: Con nhieu");
        //Dùng switch chọn loại sách. Ví dụ 1. Sách giáo khoa 2. Sách tham khảo 3. Sách chuyên ngành 4. Sách khác
        switch (loaiSach) {
            case 1:
                System.out.println("Loai sach: Sach giao khoa");
                break;
            case 2:
                System.out.println("Loai sach: Sach tham khao");
                break;
            case 3:
                System.out.println("Loai sach: Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Loai sach: Sach khac");
                break;
            default:
                System.out.println("Loai sach: Lua chon khong hop le (chi nhap tu 1 den 4)");
                break;
        }
    }
}
