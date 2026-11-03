package com.mycompany.btthtuan5;
import java.util.Scanner;
public class BTTHTUAN5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int chon;
        String masach = "";
        String tenSach = "";
        String tacGia = "";
        int namXuatBan = 0;
        double donGia = 0;
        int soLuong = 0;
        int loaiSach = 0;

        int tongSoLuong = 0;
        double tongGiaTri = 0;
        
        do {
            System.out.println("\n========== MENU QUAN LY THU VIEN ==========");
            System.out.println("1. Nhap n sach bang vong lap");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon menu (0-3): ");
            chon = sc.nextInt();
        switch (chon) { 
            case 1:  
                System.out.print("\nNhap so dau sach can nhap (n): ");
                int n = sc.nextInt();
                sc.nextLine();
                for (int i = 1; i <= n; i++) {
                    //Nhập mã sách, tên sách, tác giả, năm xuất bản, đơn giá, số lượng và hiển thị lại 
                    System.out.println("NHAP THONG TIN SACH:");

                    System.out.print("Nhap ma sach:");    
                    masach = sc.nextLine();

                    System.out.print("Nhap ten sach: ");
                    tenSach = sc.nextLine();

                    System.out.print("Nhap tac gia: ");
                    tacGia = sc.nextLine();

                    System.out.print("Nhap nam xuat ban: ");
                    namXuatBan = sc.nextInt();

                    System.out.print("Nhap don gia: ");
                    donGia = sc.nextDouble();

                    System.out.print("Nhap so luong: ");
                    soLuong = sc.nextInt();

                    System.out.print("Nhap lua chon loai sach cua ban (1-4): ");
                    loaiSach = sc.nextInt();
                    sc.nextLine();
                    
                    //Bài 2:Tính thành tiền = đơn giá × số lượng.
                    double ThanhTien = donGia * soLuong;
                    //Bài 3:Bài 3: Phí vận chuyển = 5% giá trị sách.
                    double PhiVanChuyen = ThanhTien * 0.05;
                    //Bài 4:Tổng tiền nhập = Thành tiền + Phí vận chuyển 
                    double TongTien = ThanhTien + PhiVanChuyen;
                    
                    // Cộng dồn tổng số lượng và tổng giá trị sách cho Bài 2
                    tongSoLuong = tongSoLuong + soLuong;
                    tongGiaTri = tongGiaTri + ThanhTien;

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
                break;
            case 2: 
                //Tính tổng số lượng và tổng giá trị sách
                System.out.println("\n--- TONG SO LUONG VA TONG GIA TRI SACH ---");
                System.out.println("Tong so luong sach : " + tongSoLuong);
                System.out.printf("Tong gia tri sach  : %,.0f VND\n", tongGiaTri);
                break;
            case 3:
                sc.nextLine();
                System.out.print("\nNhap ma sach can tim: ");
                String maCanTim = sc.nextLine();

                if (masach.equals(maCanTim)) {
                    System.out.println("=> Tim thay sach!");
                    System.out.println("Ma sach      : " + masach);
                    System.out.println("Ten sach     : " + tenSach);
                    System.out.println("Tac gia      : " + tacGia);
                    System.out.println("Nam xuat ban : " + namXuatBan);
                    System.out.printf("Don gia      : %,.0f VND\n", donGia);
                    System.out.println("So luong     : " + soLuong);
                    } 
                    else
                        System.out.println("=> Khong tim thay sach co ma: " + maCanTim);
                    break;

            case 0:
                System.out.println("Da thoat chuong trinh!");
                break;

            default:
                System.out.println("Lua chon khong hop le, vui long chon lai!");
                break;
        }
    }
    while (chon != 0);
}
}