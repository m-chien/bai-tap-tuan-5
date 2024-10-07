package baitaptuan5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> danhSach = new ArrayList<>();
        System.out.println("Nhap so luong phan tu cua danh sach: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int phanTu = sc.nextInt();
            danhSach.add(phanTu);
        }
        System.out.println("Cac phan tu trong danh sach la: ");
        hienthidanhSach(danhSach);
        System.out.println("Nhap phan tu muon them: ");
        int them = sc.nextInt();
        System.out.println("Nhap vi tri muon them (bat dau tu 0): ");
        int vtrithem = sc.nextInt();
        if (vtrithem >= 0 && vtrithem <= danhSach.size()) {
            danhSach.add(vtrithem, them);
            System.out.println("Mang sau khi them la:");
            hienthidanhSach(danhSach);
        } else {
            System.out.println("Vi tri khong hop le.");
        }

        sc.close();
    }

    public static void hienthidanhSach(ArrayList<Integer> danhSach) {
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println("Phan tu thu " + i + ": " + danhSach.get(i));
        }
    }
}
