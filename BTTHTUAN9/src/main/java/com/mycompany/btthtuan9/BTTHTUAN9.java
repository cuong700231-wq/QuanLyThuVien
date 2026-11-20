package com.mycompany.btthtuan9;

import java.util.ArrayList;
import java.util.Scanner;

public class BTTHTUAN9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sachgiaokhoa> dsSGK = new ArrayList<>();
        ArrayList<Sachthamkhao> dsSTK = new ArrayList<>();

        System.out.print("Nhap so luong sach giao khoa: ");
        int nSGK = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nSGK; i++) {
            System.out.println("\n--- Nhap sach giao khoa thu " + (i + 1) + " ---");
            Sachgiaokhoa sgk = new Sachgiaokhoa();
            sgk.Nhap();
            dsSGK.add(sgk);
        }

        System.out.print("\nNhap so luong sach tham khao: ");
        int nSTK = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nSTK; i++) {
            System.out.println("\n--- Nhap sach tham khao thu " + (i + 1) + " ---");
            Sachthamkhao stk = new Sachthamkhao();
            stk.Nhap();
            dsSTK.add(stk);
        }

        //  Xuất danh sách các loại sách
        System.out.println("\n===== DANH SACH SACH GIAO KHOA =====");
        for (Sachgiaokhoa sgk : dsSGK) {
            sgk.Xuat();
            System.out.println("---------------------------");
        }

        System.out.println("\n===== DANH SACH SACH THAM KHAO =====");
        for (Sachthamkhao stk : dsSTK) {
            stk.Xuat();
            System.out.println("---------------------------");
        }

        double tongTienSGK = 0;
        for (Sachgiaokhoa sgk : dsSGK) {
            tongTienSGK += sgk.ThanhTien();
        }

        double tongTienSTK = 0;
        for (Sachthamkhao stk : dsSTK) {
            tongTienSTK += stk.ThanhTien();
        }

        System.out.println("\nTong thanh tien sach giao khoa: " + tongTienSGK);
        System.out.println("Tong thanh tien sach tham khao: " + tongTienSTK);

        if (dsSTK.isEmpty()) {
            System.out.println("\nKhong co sach tham khao de tinh trung binh cong don gia.");
        } else {
            double tongDonGiaSTK = 0;
            for (Sachthamkhao stk : dsSTK) {
                tongDonGiaSTK += stk.donGia;
            }
            double tbcDonGia = tongDonGiaSTK / dsSTK.size();
            System.out.println("\nTrung binh cong don gia sach tham khao: " + tbcDonGia);
        }

        System.out.print("\nNhap ten nha xuat ban X can tim: ");
        String nxbX = sc.nextLine();

        System.out.println("\n===== SACH GIAO KHOA CUA NXB " + nxbX + " =====");
        boolean timThay = false;
        for (Sachgiaokhoa sgk : dsSGK) {
            if (sgk.nhaXuatBan.equalsIgnoreCase(nxbX)) {
                sgk.Xuat();
                System.out.println("---------------------------");
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sach giao khoa nao cua nha xuat ban " + nxbX);
        }
    }
}