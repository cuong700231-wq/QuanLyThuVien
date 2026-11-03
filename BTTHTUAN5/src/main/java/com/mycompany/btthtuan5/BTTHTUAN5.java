package com.mycompany.btthtuan5;
import java.util.ArrayList;
import java.util.Scanner;

public class BTTHTUAN5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> dsMaSach = new ArrayList<>();   
        ArrayList<String> danhSachSach = new ArrayList<>(); 
        ArrayList<Integer> dsSoLuong = new ArrayList<>();   
        ArrayList<Double> dsGiaTri = new ArrayList<>();   

        int chon;

        do {
            System.out.println("\n========== MENU QUAN LY THU VIEN==========");
            System.out.println("0. Bai 1: Nhap mang so luong 5 cuon sach (Tinh tong, Tim Max)");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon menu (0-8): ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 0:
                    // Tạo mảng int[] soLuong cho 5 cuốn sách
                    int[] soLuongMang = new int[5];
                    int tongMang = 0;

                    System.out.println("\n--- NHAP SO LUONG 5 CUON SACH ---");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Nhap so luong cuon sach thu " + (i + 1) + ": ");
                        soLuongMang[i] = sc.nextInt();
                    }

                    int max = soLuongMang[0];
                    System.out.print("So luong cac cuon sach vua nhap: ");
                    for (int i = 0; i < 5; i++) {
                        System.out.print(soLuongMang[i] + "  ");
                        tongMang = tongMang + soLuongMang[i];
                        if (soLuongMang[i] > max) {
                            max = soLuongMang[i];
                        }
                    }
                    System.out.println("\nTong so luong 5 cuon sach: " + tongMang);
                    System.out.println("So luong lon nhat (Max)  : " + max);
                    break;

                case 1:
                    // MỤC 1: THÊM SÁCH
                    System.out.println("\n--- THEM SACH MOI ---");
                    System.out.print("Nhap ma sach: ");
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

                    System.out.print("Nhap loai sach (1-4): ");
                    int loaiSach = sc.nextInt();
                    sc.nextLine(); // Xóa phím Enter thừa

                    double ThanhTien = donGia * soLuong;

                    
                    String thongTin = "Ma: " + masach + " | Ten: " + tenSach + " | TG: " + tacGia
                            + " | Nam XB: " + namXuatBan + " | Gia: " + donGia
                            + " | SL: " + soLuong + " | Thanh tien: " + ThanhTien;

                    
                    dsMaSach.add(masach);
                    danhSachSach.add(thongTin);
                    dsSoLuong.add(soLuong);
                    dsGiaTri.add(ThanhTien);

                    System.out.println("=> Da them sach thanh cong!");
                    break;

                case 2:
                    
                    System.out.println("\n--- DANH SACH SACH HIEN CO ---");
                    if (danhSachSach.size() == 0) {
                        System.out.println("Danh sach dang trong!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.println((i + 1) + ". " + danhSachSach.get(i));
                        }
                    }
                    break;

                case 3:
                    //TÌM SÁCH
                    System.out.print("\nNhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();

                    if (dsMaSach.contains(maCanTim)) {
                        for (int i = 0; i < dsMaSach.size(); i++) {
                            if (dsMaSach.get(i).equals(maCanTim)) {
                                System.out.println("=> Tim thay sach:");
                                System.out.println(danhSachSach.get(i));
                            }
                        }
                    } else {
                        System.out.println("=> Khong tim thay sach co ma: " + maCanTim);
                    }
                    break;

                case 4:
                    //XÓA SÁCH
                    System.out.print("\nNhap ma sach can xoa: ");
                    String maCanXoa = sc.nextLine();
                    boolean daXoa = false;

                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equals(maCanXoa)) {
                            dsMaSach.remove(i);
                            danhSachSach.remove(i);
                            dsSoLuong.remove(i);
                            dsGiaTri.remove(i);
                            daXoa = true;
                            System.out.println("=> Da xoa sach co ma: " + maCanXoa);
                            break;
                        }
                    }
                    if (!daXoa) {
                        System.out.println("=> Khong tim thay ma sach de xoa!");
                    }
                    break;

                case 5:
                    //SỬA SÁCH
                    System.out.print("\nNhap ma sach can sua: ");
                    String maCanSua = sc.nextLine();
                    boolean timThayDeSua = false;

                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equals(maCanSua)) {
                            timThayDeSua = true;
                            System.out.println("Nhap thong tin moi cho sach (Ma: " + maCanSua + "):");

                            System.out.print("Nhap ten sach moi: ");
                            String tenMoi = sc.nextLine();

                            System.out.print("Nhap tac gia moi: ");
                            String tacGiaMoi = sc.nextLine();

                            System.out.print("Nhap nam xuat ban moi: ");
                            int namMoi = sc.nextInt();

                            System.out.print("Nhap don gia moi: ");
                            double giaMoi = sc.nextDouble();

                            System.out.print("Nhap so luong moi: ");
                            int soLuongMoi = sc.nextInt();
                            sc.nextLine();

                            double thanhTienMoi = giaMoi * soLuongMoi;
                            String thongTinMoi = "Ma: " + maCanSua + " | Ten: " + tenMoi + " | TG: " + tacGiaMoi
                                    + " | Nam XB: " + namMoi + " | Gia: " + giaMoi
                                    + " | SL: " + soLuongMoi + " | Thanh tien: " + thanhTienMoi;

                            
                            danhSachSach.set(i, thongTinMoi);
                            dsSoLuong.set(i, soLuongMoi);
                            dsGiaTri.set(i, thanhTienMoi);

                            System.out.println("=> Da cap nhat thong tin sach thanh cong!");
                            break;
                        }
                    }
                    if (!timThayDeSua) {
                        System.out.println("=> Khong tim thay ma sach can sua!");
                    }
                    break;

                case 6:
                    //TÍNH TỔNG SỐ LƯỢNG
                    int tongSoLuong = 0;
                    for (int i = 0; i < dsSoLuong.size(); i++) {
                        tongSoLuong = tongSoLuong + dsSoLuong.get(i);
                    }
                    System.out.println("\n=> Tong so luong tat ca sach trong thu vien: " + tongSoLuong);
                    break;

                case 7:
                    //TÍNH TỔNG GIÁ TRỊ
                    double tongGiaTri = 0;
                    for (int i = 0; i < dsGiaTri.size(); i++) {
                        tongGiaTri = tongGiaTri + dsGiaTri.get(i);
                    }
                    System.out.printf("\n=> Tong gia tri tat ca sach trong thu vien: %,.0f VND\n", tongGiaTri);
                    break;

                case 8:
                    //THOÁT
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le, vui long chon tu 0 den 8!");
                    break;
            }
        } while (chon != 8);
    }
}